/**
 * 
 */
package com.heliosapm.netty.interceptor;

import java.util.Map.Entry;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInboundHandler;
import io.netty.channel.ChannelOutboundHandler;
import io.netty.channel.ChannelPipeline;

/**
 * @author nwhitehe
 *
 */
public enum HandlerDirection  {
	IN,
	OUT,
	BOTH,
	NEITHER;
	
	public static HandlerDirection direction(final ChannelHandler handler) {
		if(handler instanceof ChannelOutboundHandler) {
			return (handler instanceof ChannelInboundHandler) ? BOTH : OUT;
		} else if(handler instanceof ChannelInboundHandler) {
			return IN;
		} else {
			return NEITHER;
		}		
	}
	
	public static void instrument(final Channel channel) {
		final ChannelPipeline p = channel.pipeline();
		for(Entry<String, ChannelHandler> entry: p) {
			final ChannelHandler ch = entry.getValue();
			if(ch instanceof Interceptor) continue;
			final String name = entry.getKey();
			switch(direction(ch)) {
				case IN:
					p.replace(ch, name, new InboundInterceptor(name, (ChannelInboundHandler)ch));
					break;
				case OUT:
					p.replace(ch, name, new OutboundInterceptor(name, (ChannelOutboundHandler)ch));
					break;
				case BOTH:
					p.replace(ch, name, new DuplexInterceptor(name, ch));							
				case NEITHER:					
			}
		}
	}
	
	public static void reset(final Channel channel) {
		final ChannelPipeline p = channel.pipeline();
		for(Entry<String, ChannelHandler> entry: p) {
			final ChannelHandler ch = entry.getValue();
			if(!(ch instanceof Interceptor)) continue;
			p.replace(ch, entry.getKey(), ((Interceptor)ch).getDelegate());
		}
	}
	

}
