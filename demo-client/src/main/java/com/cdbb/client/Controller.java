package com.cdbb.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Value("${server.port}")
	private String port;

	@Value("${eureka.instance.hostname}")
	private String hostname;

	@RequestMapping("/hi")
	public String hi(@RequestParam String name) {
		return "hi " + name + "this is from " + hostname + ":" + port;
	}

}
