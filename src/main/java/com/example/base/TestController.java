package com.example.base;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.base.handler.RestWrapper;

@RestController
@RequestMapping("/spring")
public class TestController {
	
	@RequestMapping("/test")
	public String msg(RestWrapper restWrapper){
		return restWrapper.getReqParam();
	}

}
