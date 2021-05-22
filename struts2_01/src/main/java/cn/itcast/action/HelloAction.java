package cn.itcast.action;

import cn.itcast.service.CustomerService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;

public class HelloAction {

    private String name;

    public String getName(){
        return name;
    }

    public HelloAction(){
        System.out.println("居民身份证");
    }

    public String execute(){
        name = "HELLO WORLD";
//        ActionContext context = ActionContext.getContext();
//        ValueStack valueStack = context.getValueStack();
//        valueStack.set("good","night");
//        valueStack.push("ABCDEFG");
        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("list","ABCDEFG");
        return "ok";
    }
}
