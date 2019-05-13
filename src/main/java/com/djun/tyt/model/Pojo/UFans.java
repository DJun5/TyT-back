package com.djun.tyt.model.Pojo;


public class UFans {

  private long id;
  private long uid;
  private long fanId;
  private long status;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getUid() {
    return uid;
  }

  public void setUid(long uid) {
    this.uid = uid;
  }


  public long getFanId() {
    return fanId;
  }

  public void setFanId(long fanId) {
    this.fanId = fanId;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public java.sql.Timestamp getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(java.sql.Timestamp updateTime) {
    this.updateTime = updateTime;
  }

}
