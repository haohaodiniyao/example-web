package com.example.base.event;

import java.util.Date;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;

public class MyListener implements ApplicationListener<ApplicationEvent> {
    @Async
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		if(event instanceof MyEvent){
			System.out.println(new Date()+"#1");
			try {
				Thread.sleep(10*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		    System.out.println("收到消息1:"+((MyEvent)event).getMsg());
			System.out.println(new Date()+"#1");
		}
	}

}
