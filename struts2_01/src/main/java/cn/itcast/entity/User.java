package cn.itcast.entity;

import java.util.HashSet;
import java.util.Set;

public class User {

    private Integer userId;
    private String userName;
    private String userPassword;

    private Set<Role> setRole = new HashSet<Role>();

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Set<Role> getSetRole() {
        return setRole;
    }

    public void setSetRole(Set<Role> setRole) {
        this.setRole = setRole;
    }
}
