package com.example.base;

import org.dolphin.commons.annotations.Yuni;
import org.dolphin.commons.proxy.CglibProxy;
import org.dolphin.commons.util.host.IPUtil;
import org.dolphin.commons.util.host.PortUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyProxy implements BeanPostProcessor{
	Logger log = LoggerFactory.getLogger(MyProxy.class);
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		log.info(IPUtil.getIP()+":"+PortUtil.getTomcatPort());
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		Class<?> targetClass = bean.getClass();
		if(targetClass.isAnnotationPresent(Yuni.class)){
			System.out.println("before->bean:"+bean+"->beanName:"+beanName);	
			CglibProxy cglibProxy = new CglibProxy(bean);
			Object proxyBean = cglibProxy.getProxy();
			System.out.println("proxyBean:"+proxyBean);
		}
		return bean;
	}

	
}
