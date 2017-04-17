package com.example.base.test;

import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.base.event.register.RegisterEvent;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations={"classpath:root.xml"})
public class JunitTest {
    @Autowired  
    private ApplicationContext applicationContext;  
	@Test
	public void test() {
		for(int i=0;i<100;i++){
			int index = i+1;
	        new Thread(new Runnable(){
				@Override
				public void run() {
					RegisterEvent registerEvent = new RegisterEvent();
					registerEvent.setMsg("hello world#"+index);
					applicationContext.publishEvent(registerEvent);
				}
	        }).start();			
		}


        try {
			Thread.sleep(5000*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
	}
	
}
