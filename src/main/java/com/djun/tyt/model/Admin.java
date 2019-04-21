package com.djun.tyt.model;
/**
 * 管理员信息表
 */
public class Admin {
    private int id;
    /**
     * 账号
     */
    private String name;
    /**
     * 密码
     */
    private String pwd;
    /**
     * 权限级别
     */
    private int roleId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }
}
