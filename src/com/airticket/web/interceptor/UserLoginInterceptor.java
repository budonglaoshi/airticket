package com.airticket.web.interceptor;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class UserLoginInterceptor implements Interceptor{

	public void destroy() {}

	public void init() {}

	public String intercept(ActionInvocation invocation) throws Exception {
		Object user = ActionContext.getContext().getSession().get("user");
		String msg = null;
		if(null!=user){
			msg = invocation.invoke();
		}else{
			msg = Action.LOGIN;
		}
		return msg;
	}

}
