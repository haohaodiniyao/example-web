package com.example.base.event.book;

import java.util.Date;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.scheduling.annotation.Async;
/**
 * 贵宾室购买
 * @author yaokai
 *
 */
public class LoungeListener implements SmartApplicationListener {

	@Override
	public int getOrder() {
		return 0;
	}
    @Async
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		if(event instanceof BookEvent){
			System.out.println("贵宾室购买："+new Date());
			try {
				Thread.sleep(4*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		    System.out.println("收到消息:"+((BookEvent)event).getMsg());
			System.out.println("贵宾室购买结束："+new Date());
		}
		
	}

	@Override
	public boolean supportsEventType(Class<? extends ApplicationEvent> eventClass) {
		if(eventClass == BookEvent.class){
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
