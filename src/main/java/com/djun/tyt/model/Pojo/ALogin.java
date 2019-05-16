package com.djun.tyt.model.Pojo;


import java.util.Date;

public class ALogin {

  private long id;
  private String mobile;
  private String username;
  private String pwd;
  private long roleId;
  private String loginIp;
  private String loginPlace;
  private Date loginTime;
  private String lastLoginip;
  private String lastLoginPlace;
  private Date lastLoginTime;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
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


  public String getLoginIp() {
    return loginIp;
  }

  public void setLoginIp(String loginIp) {
    this.loginIp = loginIp;
  }


  public String getLoginPlace() {
    return loginPlace;
  }

  public void setLoginPlace(String loginPlace) {
    this.loginPlace = loginPlace;
  }


  public Date getLoginTime() {
    return loginTime;
  }

  public void setLoginTime(Date loginTime) {
    this.loginTime = loginTime;
  }


  public String getLastLoginip() {
    return lastLoginip;
  }

  public void setLastLoginip(String lastLoginip) {
    this.lastLoginip = lastLoginip;
  }


  public String getLastLoginPlace() {
    return lastLoginPlace;
  }

  public void setLastLoginPlace(String lastLoginPlace) {
    this.lastLoginPlace = lastLoginPlace;
  }


  public Date getLastLoginTime() {
    return lastLoginTime;
  }

  public void setLastLoginTime(Date lastLoginTime) {
    this.lastLoginTime = lastLoginTime;
  }

}
