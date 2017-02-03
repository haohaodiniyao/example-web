package com.example.base.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	public String getReqParam(){
		return request.getQueryString();
	}
}
