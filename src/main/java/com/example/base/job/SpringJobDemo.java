package com.example.base.job;
/**
 * http://www.cnblogs.com/obullxl/archive/2011/07/10/spring-quartz-cron-integration.html
 * @author yaokai
 *
 */
public class SpringJobDemo {
	public void init(){
		System.out.println("spring job init...");
	}
	public void process(){
		System.out.println("spring job is running...");
	}
}
