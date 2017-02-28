package com.example.base.httpclient;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.MultiThreadedHttpConnectionManager;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.junit.Test;

public class HttpClient3Test {

	@Test
	public void test() throws Exception {
		MultiThreadedHttpConnectionManager n =  new MultiThreadedHttpConnectionManager();  
		HttpClient client = new HttpClient(n);  
		GetMethod get = new GetMethod("https://www.baidu.com/s?ie=utf-8&f=8&rsv_bp=1&rsv_idx=1&tn=baidu&wd=%E6%96%B0%E9%97%BB&oq=%25E6%2596%25B0%25E9%2597%25BB&rsv_pq=adee08b600022bb3&rsv_t=7270Etk2R1YgR2uMYni6mqR6w%2FGB85gn0OobHGV4r0IOY7dhL%2FfvyHk2Z38&rqlang=cn&rsv_enter=0&rsv_sug=1");
		get.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET, "UTF-8");
		client.executeMethod(get);
		System.out.println(get.getRequestCharSet());
		System.out.println(get.getQueryString());
		System.out.println(get.getStatusLine().getStatusCode());
		System.out.println(get.getStatusLine().getHttpVersion());
		System.out.println(get.getStatusLine().getReasonPhrase());
		System.out.println(get.getResponseBodyAsString());
		System.out.println(get.getResponseCharSet());
	}

}
