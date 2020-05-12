package com.cdbb.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	private HiFromService hi;
	
	@RequestMapping("/hi")
	public String sayHi(@RequestParam String name) {
        return hi.sayHi(name);
    }
	
}
