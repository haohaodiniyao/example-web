package com.example.base;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/spring")
public class TestController {
	
	@RequestMapping("/test")
	@ResponseBody
	public String msg(String msg){
		return msg;
	}

}
