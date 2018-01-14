package com.example.base.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAOP {
	public void before(){
		System.out.println("###########方法执行前before");
	}
	public void after(){
		System.out.println("###########方法执行后after");
	}
	
    public void doThrowing(JoinPoint point, Throwable exception) {
    	System.out.println("异常...");
    }
    
    public Object around(ProceedingJoinPoint point) throws Throwable{
    	System.out.println("around...");
    	return null;
    }
}
