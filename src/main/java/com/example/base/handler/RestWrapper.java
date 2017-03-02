package com.example.base.handler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.example.base.util.Base64Utils;

public class RestWrapper {
	private HttpServletRequest request;
	private HttpServletResponse response;
	public HttpServletRequest getRequest() {
		return request;
	}
	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}
	public HttpServletResponse getResponse() {
		return response;
	}
	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}
	public RestWrapper(HttpServletRequest request, HttpServletResponse response) {
		this.request = request;
		this.response = response;
	}
	public String getReqParam() throws IOException{
		System.out.println(request.getQueryString());
		StringBuffer data = new StringBuffer();
		BufferedReader reader = this.request.getReader();

		String line = null;
		while (null != (line = reader.readLine())) {
			data.append(line);
		}
		System.out.println(data.toString());
		reader.close();
		return data.toString();
	}
	
	public static void main(String[] args){
		String encodeJson = "ewoJImhlbGxvIiA6ICJ3b3JsZCIKfQ==";
		try {
			String decodeJson = Base64Utils.decode(encodeJson);
			Map<String,Object> map = JSON.parseObject(decodeJson, Map.class);
			System.out.println(map);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
