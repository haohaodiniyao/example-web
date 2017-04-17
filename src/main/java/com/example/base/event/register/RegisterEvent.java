package com.example.base.event.register;

import org.springframework.context.ApplicationEvent;
/**
 * 用户注册
 * spring事件机制
 * @author yaokai
 *
 */
public class RegisterEvent extends ApplicationEvent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8401705303324820602L;
	private String msg;
	public RegisterEvent(){
		super("用户注册");
	}

	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
