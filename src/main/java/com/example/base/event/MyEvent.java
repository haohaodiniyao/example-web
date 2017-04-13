package com.example.base.event;

import org.springframework.context.ApplicationEvent;
/**
 * spring事件机制
 * @author yaokai
 *
 */
public class MyEvent extends ApplicationEvent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8401705303324820602L;
	private String msg;
	public MyEvent(){
		super("spring event");
	}

	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
