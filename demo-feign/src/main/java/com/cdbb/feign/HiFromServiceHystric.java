package com.cdbb.feign;

import org.springframework.stereotype.Component;

@Component
public class HiFromServiceHystric implements HiFromService{

	@Override
	public String sayHi(String name) {
		return "sorry, there is an error";
	}

}
