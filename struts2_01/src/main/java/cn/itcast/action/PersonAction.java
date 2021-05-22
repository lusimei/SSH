package cn.itcast.action;

import com.opensymphony.xwork2.ActionSupport;

public class PersonAction extends ActionSupport {

    @Override
    public String execute() throws Exception {
        System.out.println("--------小红------");
        return NONE;//不返回结果有两种方式：1.void 2.none
    }
}
