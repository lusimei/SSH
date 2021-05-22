package cn.itcast.action;

import com.opensymphony.xwork2.Action;

public class UserAction implements Action {

    public String execute() throws Exception {
        return "error";//测试错误，不在struts.xml中配置result name="error"，会出现404,返回结果未定义
    }
}
