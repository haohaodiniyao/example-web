package com.example.base.event;

import java.util.Date;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;

public class MyListener2 implements ApplicationListener<ApplicationEvent> {
	@Async
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		if(event instanceof MyEvent){
			System.out.println(new Date()+"#2");
			try {
				Thread.sleep(8*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		    System.out.println("收到消息2:"+((MyEvent)event).getMsg());
			System.out.println(new Date()+"#2");
		}
	}

}
