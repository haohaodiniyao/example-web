package com.example.base.event.register;

import java.util.Date;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
/**
 * 用户信息入库
 * @author yaokai
 *
 */
public class UserListener implements ApplicationListener<ApplicationEvent> {
    @Async
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		if(event instanceof RegisterEvent){
			System.out.println("用户信息入库开始："+new Date());
//			try {
//				Thread.sleep(10*1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		    System.out.println("收到消息:"+((RegisterEvent)event).getMsg());
			System.out.println("用户信息入库结束："+new Date());
		}
	}

}
