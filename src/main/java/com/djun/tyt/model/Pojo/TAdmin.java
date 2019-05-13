package com.djun.tyt.model.Pojo;


public class TAdmin {

  private long id;
  private String name;
  private String pwd;
  private long roleId;
  private long loginId;
  private long status;


  public long getId() {
    return id;
  }

  public void setId(long id) {
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


  public long getRoleId() {
    return roleId;
  }

  public void setRoleId(long roleId) {
    this.roleId = roleId;
  }


  public long getLoginId() {
    return loginId;
  }

  public void setLoginId(long loginId) {
    this.loginId = loginId;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }

}
