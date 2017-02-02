/**
 * 
 */
package com.heliosapm.netty.interceptor;

import java.net.SocketAddress;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandler;
import io.netty.channel.ChannelOutboundHandler;
import io.netty.channel.ChannelPromise;

/**
 * @author nwhitehe
 *
 */
public class DuplexInterceptor implements ChannelInboundHandler, ChannelOutboundHandler {
	protected final ChannelHandler coreDelegate;
	protected final InboundInterceptor inDelegate;
	protected final OutboundInterceptor outDelegate;
	protected final String name;
	
	public DuplexInterceptor(final String name, final ChannelHandler handler) {
		coreDelegate = handler;
		this.name = name;
		inDelegate = new InboundInterceptor(name, (ChannelInboundHandler)handler);
		outDelegate = new OutboundInterceptor(name, (ChannelOutboundHandler)handler);
	}
	
	public String getName() {
		return name;
	}

	public void channelRegistered(final ChannelHandlerContext ctx) throws Exception {
		inDelegate.channelRegistered(ctx);
	}

	public void channelUnregistered(final ChannelHandlerContext ctx) throws Exception {
		inDelegate.channelUnregistered(ctx);
	}

	public void channelActive(final ChannelHandlerContext ctx) throws Exception {
		inDelegate.channelActive(ctx);
	}

	public void channelInactive(final ChannelHandlerContext ctx) throws Exception {
		inDelegate.channelInactive(ctx);
	}

	public void channelRead(final ChannelHandlerContext ctx, final Object msg) throws Exception {
		inDelegate.channelRead(ctx, msg);
	}

	public void channelReadComplete(final ChannelHandlerContext ctx) throws Exception {
		inDelegate.channelReadComplete(ctx);
	}

	public void userEventTriggered(final ChannelHandlerContext ctx, final Object evt) throws Exception {
		inDelegate.userEventTriggered(ctx, evt);
	}

	public void channelWritabilityChanged(final ChannelHandlerContext ctx) throws Exception {
		inDelegate.channelWritabilityChanged(ctx);
	}

	public void exceptionCaught(final ChannelHandlerContext ctx, final Throwable cause) throws Exception {
		inDelegate.exceptionCaught(ctx, cause);
	}

	public void handlerAdded(final ChannelHandlerContext ctx) throws Exception {
		inDelegate.handlerAdded(ctx);
	}

	public void handlerRemoved(final ChannelHandlerContext ctx) throws Exception {
		inDelegate.handlerRemoved(ctx);
	}


	public ChannelHandler getDelegate() {
		return coreDelegate;
	}


	public void bind(ChannelHandlerContext ctx, SocketAddress localAddress, ChannelPromise promise) throws Exception {
		outDelegate.bind(ctx, localAddress, promise);
	}


	public void connect(ChannelHandlerContext ctx, SocketAddress remoteAddress, SocketAddress localAddress,
			ChannelPromise promise) throws Exception {
		outDelegate.connect(ctx, remoteAddress, localAddress, promise);
	}


	public void disconnect(ChannelHandlerContext ctx, ChannelPromise promise) throws Exception {
		outDelegate.disconnect(ctx, promise);
	}


	public void close(ChannelHandlerContext ctx, ChannelPromise promise) throws Exception {
		outDelegate.close(ctx, promise);
	}


	public void deregister(ChannelHandlerContext ctx, ChannelPromise promise) throws Exception {
		outDelegate.deregister(ctx, promise);
	}


	public void read(ChannelHandlerContext ctx) throws Exception {
		outDelegate.read(ctx);
	}


	public void write(ChannelHandlerContext ctx, Object msg, ChannelPromise promise) throws Exception {
		outDelegate.write(ctx, msg, promise);
	}


	public void flush(ChannelHandlerContext ctx) throws Exception {
		outDelegate.flush(ctx);
	}

	
}
