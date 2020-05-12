package com.cdbb.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "client-test",fallback = HiFromServiceHystric.class)
public interface HiFromService {

	@RequestMapping("/hi")
	String sayHi(@RequestParam("name") String name);
	
}
