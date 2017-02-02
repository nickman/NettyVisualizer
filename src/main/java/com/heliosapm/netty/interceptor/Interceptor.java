/**
 * 
 */
package com.heliosapm.netty.interceptor;

import io.netty.channel.ChannelHandler;

/**
 * @author nwhitehe
 *
 */
public interface Interceptor<T extends ChannelHandler> {
	public T getDelegate();
	public String getName();
}
