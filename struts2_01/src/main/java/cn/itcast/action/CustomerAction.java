package cn.itcast.action;

import cn.itcast.service.CustomerService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;

public class CustomerAction extends ActionSupport {

    @Override
    public String execute() throws Exception {
        HttpServletRequest request = ServletActionContext.getRequest();
        CustomerService service = new CustomerService();
        request.setAttribute("list",service.findAll());
        return "cs";
    }

    public String login(){
        HttpServletRequest request = ServletActionContext.getRequest();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if("123456".equals(password) && "admin".equals(username)){
            request.getSession().setAttribute("user",username);
            return "loginsucess";
        }else{
            return "login";
        }
    }
}
