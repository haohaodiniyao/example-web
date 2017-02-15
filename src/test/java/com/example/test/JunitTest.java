package com.example.test;

import java.lang.reflect.Method;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.base.model.TestBean;
import com.example.base.server.bus.BusServer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-context.xml")
public class JunitTest {
	@Autowired
	private BusServer busServer;
	
	@Test
	public void test(){
		Method method = BeanUtils.findMethod(TestBean.class, "getResult",String.class);
		busServer.call("hello world!");
	}
	
}
