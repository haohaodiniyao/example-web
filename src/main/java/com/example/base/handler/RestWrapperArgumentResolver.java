package com.example.base.handler;

import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

public class RestWrapperArgumentResolver implements HandlerMethodArgumentResolver {

	@Override
	public Object resolveArgument(MethodParameter mp, ModelAndViewContainer mavc, NativeWebRequest nwr,
			WebDataBinderFactory wdbf) throws Exception {
//		HttpServletRequest request = nwr.getNativeRequest(HttpServletRequest.class);
//		HttpServletResponse response = nwr.getNativeResponse(HttpServletResponse.class);
//		return new RestWrapper(request,response);
		return null;
	}

	@Override
	public boolean supportsParameter(MethodParameter parameter) {
//		return RestWrapper.class.getName().equalsIgnoreCase(parameter.getParameterType().getName());
		return true;
	}

}
