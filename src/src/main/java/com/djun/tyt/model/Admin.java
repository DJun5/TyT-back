package com.djun.tyt.model;

public class Admin {
    private Integer id;
    private String name;
    private String pwd;
    private int roleid;

    public Admin() {

    }

    public Admin(Integer id, String name, String pwd, int roleid) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.roleid = roleid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }
}
