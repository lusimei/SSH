package cn.itcast.method;

import cn.itcast.entity.Customer;
import cn.itcast.service.CustomerService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class BookAction extends ActionSupport {

    public String add(){
        System.out.println("-------------执行add————————————");
        return NONE;
    }

    public String update(){
        System.out.println("-------------执行update————————————");
        return NONE;
    }

    public String list(){
        CustomerService customerService = new CustomerService();
        List<Customer> list = customerService.findAll();
        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("list",list);
        return "list";
    }
}
