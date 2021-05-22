package cn.itcast.action;

import cn.itcast.entity.UserInfo;
import com.opensymphony.xwork2.ActionSupport;

public class ObjectDemoAction extends ActionSupport {

    private UserInfo userInfo = new UserInfo();

    public UserInfo getUserInfo() {
        return userInfo;
    }

    @Override
    public String execute() throws Exception {
        userInfo.setAddress("大陆");
        userInfo.setPassword("123456");
        userInfo.setUsername("LUSHIMEI");
        return "success";
    }
}
