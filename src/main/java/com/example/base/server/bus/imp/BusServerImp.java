package com.example.base.server.bus.imp;

import com.example.base.server.bus.BusServer;
import com.example.base.server.bus.BusServer2;

public class BusServerImp implements BusServer{

	private BusServer2 busServer2;
	
	public void init(){
		System.out.println("初始化1...");
	}
	
	@Override
	public String call(String msg) {
		try {
			Thread.sleep(10*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return busServer2.call(msg);
	}

	public void destroy(){
		System.out.println("销毁1...");
	}

	public BusServer2 getBusServer2() {
		return busServer2;
	}

	public void setBusServer2(BusServer2 busServer2) {
		this.busServer2 = busServer2;
	}
	
	
}
