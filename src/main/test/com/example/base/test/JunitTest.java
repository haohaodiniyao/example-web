package com.example.base.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.base.mapper.User;
import com.example.base.mapper.UserMapper;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations={"classpath:root.xml"})
public class JunitTest {
	@Autowired
	private UserMapper userMapper;
	@Test
	public void test() {
		
		User user = new User();
//		user.setId(1L);
//		user.setUid(100);
//		userMapper.updateByPrimaryKeySelective(user);
//		String type = "2";
//		switch(type){
//			case "1":
//				System.out.println(1);
//			case "2":
//				System.out.println(2);
//			case "3":
//				System.out.println(3);
//			default:
//				System.out.println(4);	
//		}
	}
	
}
