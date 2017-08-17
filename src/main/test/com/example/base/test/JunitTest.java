package com.example.base.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.base.mapper.User;
import com.example.base.server.user.UserService;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations={"classpath:root.xml"})
public class JunitTest {
	@Autowired
	private UserService userService;
    @Autowired  
    private ApplicationContext applicationContext;  
	@Test
	public void test() {
//		for(int i=0;i<100;i++){
//			int index = i+1;
//	        new Thread(new Runnable(){
//				@Override
//				public void run() {
//					RegisterEvent registerEvent = new RegisterEvent();
//					registerEvent.setMsg("hello world#"+index);
//					applicationContext.publishEvent(registerEvent);
//				}
//	        }).start();			
//		}
//
//
//        try {
//			Thread.sleep(5000*1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		User record = new User();
		record.setUserId(101);
		record.setUserName("hello123");
		record.setDeptName("dept123");
		record.setCreateDate(new Date());
		try {
			userService.saveUser(record);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(record);
		
	}
	
}
