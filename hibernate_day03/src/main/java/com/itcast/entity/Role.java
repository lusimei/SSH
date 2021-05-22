package com.itcast.entity;

import java.util.HashSet;
import java.util.Set;

public class Role {

    private Integer roleId;
    private String roleName;
    private String roleMemo;

    private Set<User> setUser = new HashSet<User>();

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleMemo() {
        return roleMemo;
    }

    public void setRoleMemo(String roleMemo) {
        this.roleMemo = roleMemo;
    }

    public Set<User> getSetUser() {
        return setUser;
    }

    public void setSetUser(Set<User> setUser) {
        this.setUser = setUser;
    }
}
