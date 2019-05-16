package com.djun.tyt.model.Pojo;


import java.util.Date;

public class ULogin {

  private long id;
  private String password;
  private long uid;
  private long loginTypeId;
  private Date loginTime;
  private String loginPlace;
  private String loginIp;
  private String loginToken;
  private String lastLoginIp;
  private Date lastLoginTime;
  private String lastLoginPlace;
  private String lastLoginToken;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public long getUid() {
    return uid;
  }

  public void setUid(long uid) {
    this.uid = uid;
  }


  public long getLoginTypeId() {
    return loginTypeId;
  }

  public void setLoginTypeId(long loginTypeId) {
    this.loginTypeId = loginTypeId;
  }


  public Date getLoginTime() {
    return loginTime;
  }

  public void setLoginTime(Date loginTime) {
    this.loginTime = loginTime;
  }


  public String getLoginPlace() {
    return loginPlace;
  }

  public void setLoginPlace(String loginPlace) {
    this.loginPlace = loginPlace;
  }


  public String getLoginIp() {
    return loginIp;
  }

  public void setLoginIp(String loginIp) {
    this.loginIp = loginIp;
  }


  public String getLoginToken() {
    return loginToken;
  }

  public void setLoginToken(String loginToken) {
    this.loginToken = loginToken;
  }


  public String getLastLoginIp() {
    return lastLoginIp;
  }

  public void setLastLoginIp(String lastLoginIp) {
    this.lastLoginIp = lastLoginIp;
  }


  public Date getLastLoginTime() {
    return lastLoginTime;
  }

  public void setLastLoginTime(Date lastLoginTime) {
    this.lastLoginTime = lastLoginTime;
  }


  public String getLastLoginPlace() {
    return lastLoginPlace;
  }

  public void setLastLoginPlace(String lastLoginPlace) {
    this.lastLoginPlace = lastLoginPlace;
  }


  public String getLastLoginToken() {
    return lastLoginToken;
  }

  public void setLastLoginToken(String lastLoginToken) {
    this.lastLoginToken = lastLoginToken;
  }

}
