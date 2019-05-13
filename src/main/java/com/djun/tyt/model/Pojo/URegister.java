package com.djun.tyt.model.Pojo;


public class URegister {

  private long id;
  private java.sql.Timestamp rTime;
  private long typeId;
  private long uid;
  private long userStatus;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public java.sql.Timestamp getRTime() {
    return rTime;
  }

  public void setRTime(java.sql.Timestamp rTime) {
    this.rTime = rTime;
  }


  public long getTypeId() {
    return typeId;
  }

  public void setTypeId(long typeId) {
    this.typeId = typeId;
  }


  public long getUid() {
    return uid;
  }

  public void setUid(long uid) {
    this.uid = uid;
  }


  public long getUserStatus() {
    return userStatus;
  }

  public void setUserStatus(long userStatus) {
    this.userStatus = userStatus;
  }

}
