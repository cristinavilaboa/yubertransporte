package com.thejavageek.jaxrs;


import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/HelloWorld")
public class HelloWorldService {

	@GET
	@Path("/sayHello")
	public String sayHello() {
		return "<h1>Hello World</h1>";
	}

}
