package com.example.base.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.base.aop.MyAOPDemo1;
import com.example.base.aop.MyAOPDemo2;
import com.example.base.aop.aop2.MyAOPDemo3;
import com.example.base.aop.aop2.MyAOPDemo4;
import com.example.base.aop.aop2.aop3.MyAOPDemo5;
import com.example.base.aop.aop2.aop3.MyAOPDemo6;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations={"classpath:spring/spring-aop.xml"})
public class JunitTest {
	@Autowired
	private MyAOPDemo1 myAOPDemo1;
	@Autowired
	private MyAOPDemo2 myAOPDemo2;
	@Autowired
	private MyAOPDemo3 myAOPDemo3;
	@Autowired
	private MyAOPDemo4 myAOPDemo4;
	@Autowired
	private MyAOPDemo5 myAOPDemo5;
	@Autowired
	private MyAOPDemo6 myAOPDemo6;
	@Test
	public void test() throws Exception {
		myAOPDemo1.getMsg("hello aop1");
		try {
			Thread.sleep(100*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		myAOPDemo2.getMsg("hello aop2");	
//		myAOPDemo3.getMsg("hello aop3");
//		myAOPDemo4.getMsg("hello aop4");
//		myAOPDemo5.getMsg("hello aop5");
//		myAOPDemo6.getMsg("hello aop6");
//		User user = new User();
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
