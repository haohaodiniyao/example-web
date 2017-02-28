package com.example.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.base.mapper.User;
import com.example.base.mapper.UserMapper;
import com.example.base.model.Person;
import com.google.common.collect.Lists;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/*.xml")
public class JunitTest {
//	@Autowired
//	private BusServer busServer;
	
	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void test(){
//		Method method = BeanUtils.findMethod(TestBean.class, "getResult",String.class);
//		busServer.call("hello world!");
		
//		Set<String> set = Sets.newHashSet();
//		set.add("1");
//		set.add("2");
//		Iterator<String> list = set.iterator();
//		while(list.hasNext()){
//			System.out.println(list.next());
//		}
		User user = new User();
		
		
		
		userMapper.insertSelective(user);
	}
	
}
