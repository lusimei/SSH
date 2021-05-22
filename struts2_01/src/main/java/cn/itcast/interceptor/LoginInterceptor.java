package cn.itcast.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;

public class LoginInterceptor extends MethodFilterInterceptor {

    protected String doIntercept(ActionInvocation actionInvocation) throws Exception {
        HttpServletRequest request = ServletActionContext.getRequest();
        Object user = request.getSession().getAttribute("user");
        if(user != null){
            return actionInvocation.invoke();
        }
        return "login";
    }
}
