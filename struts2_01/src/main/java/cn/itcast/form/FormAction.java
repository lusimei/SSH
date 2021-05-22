package cn.itcast.form;

import cn.itcast.entity.UserInfo;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.HttpParameters;
import org.apache.struts2.dispatcher.Parameter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FormAction extends ActionSupport{

    @Override
    public String execute() throws Exception {
//        ActionContext context = ActionContext.getContext();
//        HttpParameters parameters = context.getParameters();
//        Set<Map.Entry<String, Parameter>> set = parameters.entrySet();
//        Iterator<Map.Entry<String, Parameter>> iterator = set.iterator();
//        while (iterator.hasNext()){
//            Map.Entry<String, Parameter> next = iterator.next();
//            System.out.println(next.getKey()+":"+next.getValue());
//        }

        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("req","reqValue");

        HttpSession session = request.getSession();
        session.setAttribute("sess","sessValue");

        ServletContext context = ServletActionContext.getServletContext();
        context.setAttribute("context","contextValue");
        return NONE;
    }

    public String request(){
        HttpServletRequest request = ServletActionContext.getRequest();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String address = request.getParameter("address");
        System.out.println("username:"+username+",password:"+password+",address:"+address);

        UserInfo userInfo = new UserInfo();
        userInfo.setUsername(username);
        userInfo.setPassword(password);
        userInfo.setAddress(address);
        System.out.println(userInfo);
        return NONE;
    }
}
