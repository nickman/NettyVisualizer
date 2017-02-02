/**
 * 
 */
package com.heliosapm.netty.interceptor;

import io.netty.channel.ChannelHandlerContext;

/**
 * @author nwhitehe
 *
 */
public interface PipelineEventHandler {
	public void handleEvent(final ChannelHandlerContext ctx, final Object...args);
}
