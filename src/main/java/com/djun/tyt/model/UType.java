package com.djun.tyt.model;

/**
 * 用户类型表
 */
public class UType {

  private long id;
  // 类别名称
  private String tname;
  // 是否为授权用户
  private long isAuthentication;
  // 用户id
  private long uid;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getTname() {
    return tname;
  }

  public void setTname(String tname) {
    this.tname = tname;
  }


  public long getIsAuthentication() {
    return isAuthentication;
  }

  public void setIsAuthentication(long isAuthentication) {
    this.isAuthentication = isAuthentication;
  }


  public long getUid() {
    return uid;
  }

  public void setUid(long uid) {
    this.uid = uid;
  }

}
