package com.example.test;

import java.util.Iterator;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.base.server.bus.BusServer;
import com.google.common.collect.Sets;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-context.xml")
public class JunitTest {
//	@Autowired
//	private BusServer busServer;
	
	@Test
	public void test(){
//		Method method = BeanUtils.findMethod(TestBean.class, "getResult",String.class);
//		busServer.call("hello world!");
		
		Set<String> set = Sets.newHashSet();
		set.add("1");
		set.add("2");
		Iterator<String> list = set.iterator();
		while(list.hasNext()){
			System.out.println(list.next());
		}
	}
	
}
