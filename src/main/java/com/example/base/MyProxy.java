package com.example.base;

import org.dolphin.commons.annotations.Yuni;
import org.dolphin.commons.proxy.CglibProxy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyProxy implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
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
