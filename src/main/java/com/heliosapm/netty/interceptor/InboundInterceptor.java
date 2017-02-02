/**
 * 
 */
package com.heliosapm.netty.interceptor;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandler;

/**
 * @author nwhitehe
 *
 */
public class InboundInterceptor implements ChannelInboundHandler, Interceptor<ChannelInboundHandler> {
	protected final ChannelInboundHandler delegate;
	protected final String name;
	
	public InboundInterceptor(final String name, final ChannelInboundHandler delegate) {
		if(delegate==null) throw new IllegalArgumentException("The delegate ChannelInboundHandler was null");
		this.delegate = delegate;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	
	@Override
	public ChannelInboundHandler getDelegate() {
		return delegate;
	}

	public void channelRegistered(ChannelHandlerContext ctx) throws Exception {
		delegate.channelRegistered(ctx);
	}

	public void channelUnregistered(ChannelHandlerContext ctx) throws Exception {
		delegate.channelUnregistered(ctx);
	}

	public void channelActive(ChannelHandlerContext ctx) throws Exception {
		delegate.channelActive(ctx);
	}

	public void channelInactive(ChannelHandlerContext ctx) throws Exception {
		delegate.channelInactive(ctx);
	}

	public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
		delegate.channelRead(ctx, msg);
	}

	public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
		delegate.channelReadComplete(ctx);
	}

	public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
		delegate.userEventTriggered(ctx, evt);
	}

	public void channelWritabilityChanged(ChannelHandlerContext ctx) throws Exception {
		delegate.channelWritabilityChanged(ctx);
	}

	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
		delegate.exceptionCaught(ctx, cause);
	}

	public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
		delegate.handlerAdded(ctx);
	}

	public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
		delegate.handlerRemoved(ctx);
	}

	
	
}
