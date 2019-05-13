package com.djun.tyt.model.Pojo;


public class UService {

  private long id;
  private long tid;
  private long uid;
  private String sName;
  private String description;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp ustime;
  private long status;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getTid() {
    return tid;
  }

  public void setTid(long tid) {
    this.tid = tid;
  }


  public long getUid() {
    return uid;
  }

  public void setUid(long uid) {
    this.uid = uid;
  }


  public String getSName() {
    return sName;
  }

  public void setSName(String sName) {
    this.sName = sName;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public java.sql.Timestamp getUstime() {
    return ustime;
  }

  public void setUstime(java.sql.Timestamp ustime) {
    this.ustime = ustime;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }

}
