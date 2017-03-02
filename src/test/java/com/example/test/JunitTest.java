package com.example.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.example.base.process.RequestModel;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-context.xml")
public class JunitTest {
	@Autowired
	private RequestModel requestModel;
	
	@Test
	public void test(){
		System.out.println(JSON.toJSONString(requestModel.getList()));
		System.out.println(JSON.toJSONString(requestModel.getSet()));
		System.out.println(JSON.toJSONString(requestModel.getMap()));
		System.out.println(JSON.toJSONString(requestModel.getProps()));
	}
	
}
