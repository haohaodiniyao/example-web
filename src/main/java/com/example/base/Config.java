package com.example.base;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.base.server.bus.BusServer;
import com.example.base.server.bus.imp.BusServerImp;


public class Config {

	@Bean(initMethod="init",destroyMethod="destroy")
	public BusServer busServer(){
		return new BusServerImp();
	}
}
