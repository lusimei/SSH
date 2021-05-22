package cn.itcast.action;

import cn.itcast.entity.UserInfo;
import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.List;

public class ListDemoAction extends ActionSupport {

    private List<UserInfo> list = new ArrayList<UserInfo>();

    public List<UserInfo> getList() {
        return list;
    }

    @Override
    public String execute() throws Exception {
        UserInfo userInfo = new UserInfo();
        userInfo.setAddress("大陆");
        userInfo.setPassword("123456");
        userInfo.setUsername("LUSHIMEI");
        list.add(userInfo);
        userInfo = new UserInfo();
        userInfo.setAddress("台湾");
        userInfo.setPassword("654321");
        userInfo.setUsername("DABSI");
        list.add(userInfo);
        return "success";
    }
}
