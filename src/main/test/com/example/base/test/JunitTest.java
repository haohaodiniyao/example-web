package com.example.base.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.base.event.MyEvent;
import com.example.base.event.MyEvent2;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations={"classpath:root.xml"})
public class JunitTest {
    @Autowired  
    private ApplicationContext applicationContext;  
	@Test
	public void test() {
        new Thread(new Runnable(){
			@Override
			public void run() {
				MyEvent myEvent = new MyEvent();
				myEvent.setMsg("hello world");
				applicationContext.publishEvent(myEvent);
			}
        }).start();

        new Thread(new Runnable(){
			@Override
			public void run() {
				MyEvent2 myEvent2 = new MyEvent2();
				myEvent2.setMsg("hello world2");
				applicationContext.publishEvent(myEvent2);
			}
        }).start();
        try {
			Thread.sleep(50*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
	}
	
}
