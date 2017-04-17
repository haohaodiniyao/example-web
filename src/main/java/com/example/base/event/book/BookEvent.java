package com.example.base.event.book;

import org.springframework.context.ApplicationEvent;
/**
 * 用户预订
 * spring事件机制
 * @author yaokai
 *
 */
public class BookEvent extends ApplicationEvent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8401705303324820602L;
	private String msg;
	public BookEvent(){
		super("用户预订");
	}

	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
