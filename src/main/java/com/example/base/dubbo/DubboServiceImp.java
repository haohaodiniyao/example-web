package com.example.base.dubbo;

public class DubboServiceImp implements DubboService {

	@Override
	public String sayHello(String msg) {
		
		return msg;
	}

}
