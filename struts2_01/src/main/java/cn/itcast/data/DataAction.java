package cn.itcast.data;

import cn.itcast.entity.UserInfo;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class DataAction extends ActionSupport implements ModelDriven<UserInfo> {
    //在一个action中，不能同时使用属性封装和模型驱动封装获取同一个表单数据，如果同时使用，只会执行模型驱动
    private String username;
    private String password;
    private String address;
    private UserInfo user = new UserInfo();

    public UserInfo getModel() {
        return user;
    }

    @Override
    public String execute() throws Exception {
        return NONE;
    }

    public String property(){
        System.out.println(username+":"+password+":"+address);
        return NONE;
    }

    public String model(){
        System.out.println(username+":"+password+":"+address);
        System.out.println(user);
        return NONE;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
