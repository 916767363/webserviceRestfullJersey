package com.webservice.jersey;

import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.server.ResourceConfig;

/**
 * 
 * @ClassName: RESTApplication
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: lyb
 * @date: 2018年6月28日 下午10:36:32
 */
public class RESTApplication extends ResourceConfig {
	public RESTApplication() {
		// 给出要扫描的包,也就是上面heloword所在的包,扫描多个包使用分号隔开
		packages("com.webservice.jersey");
		// 打开日志,便于调试
		register(LoggingFilter.class);
	}
}