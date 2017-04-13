package com.example.base.server.bus.imp;

import org.dolphin.commons.annotations.Yuni;
import org.dolphin.commons.annotations.YuniLogger;

import com.example.base.server.bus.BusServer2;
@Yuni
public class BusServerImp2 implements BusServer2{

	public void init(){
		System.out.println("初始化2...");
	}
	
	@Override
	@YuniLogger
	public String call(String msg) {
		System.out.println(msg);
		return msg;
	}

	public void destroy(){
		System.out.println("销毁2...");
	}
}
