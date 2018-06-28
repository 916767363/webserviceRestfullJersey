package com.webservice.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * 
 * @ClassName:  HelloWorldController   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: lyb 
 * @date:   2018年6月28日 下午10:36:20
 */
@Path("/hello")
public class HelloWorldController {

	@GET
	@Produces(MediaType.TEXT_PLAIN) // 指定返回类型为text_plain
	public String helloWorld() {

		return "hello world!";
	}
}