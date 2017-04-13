package com.example.base.event;

import java.util.Date;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.scheduling.annotation.Async;

public class MyListener3 implements SmartApplicationListener {

	@Override
	public int getOrder() {
		return 1;
	}
    @Async
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		if(event instanceof MyEvent2){
			System.out.println(new Date()+"#3");
			try {
				Thread.sleep(6*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		    System.out.println("收到消息3:"+((MyEvent2)event).getMsg());
			System.out.println(new Date()+"#3");
		}
		
	}

	@Override
	public boolean supportsEventType(Class<? extends ApplicationEvent> eventClass) {
		if(eventClass == MyEvent2.class){
			return true;
		}
		return false;
	}

	@Override
	public boolean supportsSourceType(Class<?> paramClass) {
		if(paramClass == String.class){
			return true;
		}
		return false;
	}

}
