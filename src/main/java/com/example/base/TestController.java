package com.example.base;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dolphin.commons.http.RestWrapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.base.httpclient.User;

@Controller
@RequestMapping("/spring")
public class TestController {
	
	@RequestMapping("/test")
	public void msg(HttpServletRequest request, HttpServletResponse response,RestWrapper rw) throws Exception{
		User user = rw.parseObject(User.class);
		rw.send(user);
	}

}
