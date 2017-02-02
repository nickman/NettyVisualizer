/**
 * 
 */
package com.heliosapm.netty.interceptor;

import java.net.SocketAddress;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOutboundHandler;
import io.netty.channel.ChannelPromise;

/**
 * @author nwhitehe
 *
 */
public class OutboundInterceptor implements ChannelOutboundHandler, Interceptor<ChannelOutboundHandler> {
	protected final ChannelOutboundHandler delegate;
	protected final String name;
	
	@Override
	public ChannelOutboundHandler getDelegate() {
		return delegate;
	}
	
	public String getName() {
		return name;
	}

	
	public OutboundInterceptor(final String name, final ChannelOutboundHandler delegate) {
		if(delegate==null) throw new IllegalArgumentException("The delegate ChannelOutboundHandler was null");
		this.delegate = delegate;
		this.name = name;
	}

	public void bind(final ChannelHandlerContext ctx, final SocketAddress localAddress, final ChannelPromise promise) throws Exception {
		delegate.bind(ctx, localAddress, promise);
	}

	public void connect(final ChannelHandlerContext ctx, final SocketAddress remoteAddress, final SocketAddress localAddress,
			final ChannelPromise promise) throws Exception {
		delegate.connect(ctx, remoteAddress, localAddress, promise);
	}

	public void disconnect(final ChannelHandlerContext ctx, final ChannelPromise promise) throws Exception {
		delegate.disconnect(ctx, promise);
	}

	public void close(final ChannelHandlerContext ctx, final ChannelPromise promise) throws Exception {
		delegate.close(ctx, promise);
	}

	public void deregister(final ChannelHandlerContext ctx, final ChannelPromise promise) throws Exception {
		delegate.deregister(ctx, promise);
	}

	public void read(final ChannelHandlerContext ctx) throws Exception {
		delegate.read(ctx);
	}

	public void write(final ChannelHandlerContext ctx, final Object msg, final ChannelPromise promise) throws Exception {
		delegate.write(ctx, msg, promise);
	}

	public void flush(final ChannelHandlerContext ctx) throws Exception {
		delegate.flush(ctx);
	}

	public void handlerAdded(final ChannelHandlerContext ctx) throws Exception {
		delegate.handlerAdded(ctx);
	}

	public void handlerRemoved(final ChannelHandlerContext ctx) throws Exception {
		delegate.handlerRemoved(ctx);
	}

	
	@Deprecated
	public void exceptionCaught(final ChannelHandlerContext ctx, final Throwable cause) throws Exception {
		delegate.exceptionCaught(ctx, cause);
	}

}
