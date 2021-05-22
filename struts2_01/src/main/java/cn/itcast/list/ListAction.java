package cn.itcast.list;

import cn.itcast.entity.UserInfo;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

public class ListAction extends ActionSupport {

    private List<UserInfo> list;

    @Override
    public String execute() throws Exception {
        System.out.println(list);
        return NONE;
    }

    public List<UserInfo> getList() {
        return list;
    }

    public void setList(List<UserInfo> list) {
        this.list = list;
    }
}
