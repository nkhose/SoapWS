package com.bt.ws;

import javax.jws.WebService;

@WebService(name = "HelloWorldPortType", serviceName = "HelloWorldService")
public class HelloWorldImpl {
	public String sayHelloWorld(String message) {
		try {
			System.out.println("sayHelloWorld:" + message);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return "Here is the message: '" + message + "'";
	}

}
