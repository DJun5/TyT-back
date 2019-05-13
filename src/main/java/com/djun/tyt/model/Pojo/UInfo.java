package com.djun.tyt.model.Pojo;


public class UInfo {

  private long id;
  private long fid;
  private long uid;
  private long oid;
  private String title;
  private String content;
  private long praise;
  private long forward;
  private long status;
  private long browseVolume;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getFid() {
    return fid;
  }

  public void setFid(long fid) {
    this.fid = fid;
  }


  public long getUid() {
    return uid;
  }

  public void setUid(long uid) {
    this.uid = uid;
  }


  public long getOid() {
    return oid;
  }

  public void setOid(long oid) {
    this.oid = oid;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public long getPraise() {
    return praise;
  }

  public void setPraise(long praise) {
    this.praise = praise;
  }


  public long getForward() {
    return forward;
  }

  public void setForward(long forward) {
    this.forward = forward;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public long getBrowseVolume() {
    return browseVolume;
  }

  public void setBrowseVolume(long browseVolume) {
    this.browseVolume = browseVolume;
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
