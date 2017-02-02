/**
 * 
 */
package com.heliosapm.netty.interceptor;

import io.netty.channel.Channel;

/**
 * @author nwhitehe
 *
 */
public interface PipelineInstrumentor {
	public void instrument(final Channel channel);
	public void reset(final Channel channel);
}
