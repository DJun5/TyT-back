package com.djun.tyt.model.Vo;

import io.swagger.annotations.ApiModel;

@ApiModel(description = "管理员信息")
public class AdminVo {
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
    /**
     * 管理员级别名称
     */
    private String roleName;

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

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
