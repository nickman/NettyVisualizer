/**
 * 
 */
package com.heliosapm.netty.interceptor;

import io.netty.channel.ChannelHandlerContext;

/**
 * @author nwhitehe
 *
 */
public enum PipelineEvent implements PipelineEventHandler {
    /** Pipeline Event Handler for <b><code>ChannelInboundHandler.channelRegistered(io.netty.channel.ChannelHandlerContext)</code></b> */
    CHANNELREGISTERED(true){
        @Override
        public void handleEvent(final ChannelHandlerContext ctx, final Object... args) {
            // TODO            
        }
    },
    /** Pipeline Event Handler for <b><code>ChannelInboundHandler.channelUnregistered(io.netty.channel.ChannelHandlerContext)</code></b> */
    CHANNELUNREGISTERED(true){
        @Override
        public void handleEvent(final ChannelHandlerContext ctx, final Object... args) {
            // TODO            
        }
    },
    /** Pipeline Event Handler for <b><code>ChannelInboundHandler.channelReadComplete(io.netty.channel.ChannelHandlerContext)</code></b> */
    CHANNELREADCOMPLETE(true){
        @Override
        public void handleEvent(final ChannelHandlerContext ctx, final Object... args) {
            // TODO            
        }
    },
    /** Pipeline Event Handler for <b><code>ChannelInboundHandler.userEventTriggered(io.netty.channel.ChannelHandlerContext,java.lang.Object)</code></b> */
    USEREVENTTRIGGERED(true){
        @Override
        public void handleEvent(final ChannelHandlerContext ctx, final Object... args) {
            // TODO            
        }
    },
    /** Pipeline Event Handler for <b><code>ChannelInboundHandler.channelWritabilityChanged(io.netty.channel.ChannelHandlerContext)</code></b> */
    CHANNELWRITABILITYCHANGED(true){
        @Override
        public void handleEvent(final ChannelHandlerContext ctx, final Object... args) {
            // TODO            
        }
    },
    /** Pipeline Event Handler for <b><code>ChannelInboundHandler.channelRead(io.netty.channel.ChannelHandlerContext,java.lang.Object)</code></b> */
    CHANNELREAD(true){
        @Override
        public void handleEvent(final ChannelHandlerContext ctx, final Object... args) {
            // TODO            
        }
    },
    /** Pipeline Event Handler for <b><code>ChannelInboundHandler.channelInactive(io.netty.channel.ChannelHandlerContext)</code></b> */
    CHANNELINACTIVE(true){
        @Override
        public void handleEvent(final ChannelHandlerContext ctx, final Object... args) {
            // TODO            
        }
    },
    /** Pipeline Event Handler for <b><code>ChannelInboundHandler.exceptionCaught(io.netty.channel.ChannelHandlerContext,java.lang.Throwable)</code></b> */
    EXCEPTIONCAUGHT(true){
        @Override
        public void handleEvent(final ChannelHandlerContext ctx, final Object... args) {
            // TODO            
        }
    },
    /** Pipeline Event Handler for <b><code>ChannelInboundHandler.channelActive(io.netty.channel.ChannelHandlerContext)</code></b> */
    CHANNELACTIVE(true){
        @Override
        public void handleEvent(final ChannelHandlerContext ctx, final Object... args) {
            // TODO            
        }
    },
    /** Pipeline Event Handler for <b><code>ChannelOutboundHandler.write(io.netty.channel.ChannelHandlerContext,java.lang.Object,io.netty.channel.ChannelPromise)</code></b> */
    WRITE(false){
        @Override
        public void handleEvent(final ChannelHandlerContext ctx, final Object... args) {
            // TODO            
        }
    },
    /** Pipeline Event Handler for <b><code>ChannelOutboundHandler.connect(io.netty.channel.ChannelHandlerContext,java.net.SocketAddress,java.net.SocketAddress,io.netty.channel.ChannelPromise)</code></b> */
    CONNECT(false){
        @Override
        public void handleEvent(final ChannelHandlerContext ctx, final Object... args) {
            // TODO            
        }
    },
    /** Pipeline Event Handler for <b><code>ChannelOutboundHandler.read(io.netty.channel.ChannelHandlerContext)</code></b> */
    READ(false){
        @Override
        public void handleEvent(final ChannelHandlerContext ctx, final Object... args) {
            // TODO            
        }
    },
    /** Pipeline Event Handler for <b><code>ChannelOutboundHandler.close(io.netty.channel.ChannelHandlerContext,io.netty.channel.ChannelPromise)</code></b> */
    CLOSE(false){
        @Override
        public void handleEvent(final ChannelHandlerContext ctx, final Object... args) {
            // TODO            
        }
    },
    /** Pipeline Event Handler for <b><code>ChannelOutboundHandler.flush(io.netty.channel.ChannelHandlerContext)</code></b> */
    FLUSH(false){
        @Override
        public void handleEvent(final ChannelHandlerContext ctx, final Object... args) {
            // TODO            
        }
    },
    /** Pipeline Event Handler for <b><code>ChannelOutboundHandler.bind(io.netty.channel.ChannelHandlerContext,java.net.SocketAddress,io.netty.channel.ChannelPromise)</code></b> */
    BIND(false){
        @Override
        public void handleEvent(final ChannelHandlerContext ctx, final Object... args) {
            // TODO            
        }
    },
    /** Pipeline Event Handler for <b><code>ChannelOutboundHandler.deregister(io.netty.channel.ChannelHandlerContext,io.netty.channel.ChannelPromise)</code></b> */
    DEREGISTER(false){
        @Override
        public void handleEvent(final ChannelHandlerContext ctx, final Object... args) {
            // TODO            
        }
    },
    /** Pipeline Event Handler for <b><code>ChannelOutboundHandler.disconnect(io.netty.channel.ChannelHandlerContext,io.netty.channel.ChannelPromise)</code></b> */
    DISCONNECT(false){
        @Override
        public void handleEvent(final ChannelHandlerContext ctx, final Object... args) {
            // TODO            
        }
    };
	
	private PipelineEvent(final boolean inbound) {
		this.inbound = inbound;
		outbound = !inbound;
	}
	
	public final boolean inbound;
	public final boolean outbound;

}
