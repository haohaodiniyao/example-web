package com.example.base;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.base.handler.RestWrapper;

@RestController
@RequestMapping("/spring")
public class TestController {
	
	@RequestMapping("/test")
	public String msg(HttpServletRequest request, HttpServletResponse response,RestWrapper restWrapper) throws Exception{
		restWrapper.getReqParam();
		return "111111111";
	}

}
