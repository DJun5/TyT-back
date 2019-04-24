package com.djun.tyt.model;

public class TUser {

  private long id;
  private String uName;
  private long typeId;
  private String phone;
  private String email;
  private String headImg;
  private long uLevel;
  private String faceImg;
  private long fansNum;
  private long fansUid;
  private long blacklistUid;
  private long experience;
  private long healthDegree;
  private long honorDegree;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getUName() {
    return uName;
  }

  public void setUName(String uName) {
    this.uName = uName;
  }


  public long getTypeId() {
    return typeId;
  }

  public void setTypeId(long typeId) {
    this.typeId = typeId;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public String getHeadImg() {
    return headImg;
  }

  public void setHeadImg(String headImg) {
    this.headImg = headImg;
  }


  public long getULevel() {
    return uLevel;
  }

  public void setULevel(long uLevel) {
    this.uLevel = uLevel;
  }


  public String getFaceImg() {
    return faceImg;
  }

  public void setFaceImg(String faceImg) {
    this.faceImg = faceImg;
  }


  public long getFansNum() {
    return fansNum;
  }

  public void setFansNum(long fansNum) {
    this.fansNum = fansNum;
  }


  public long getFansUid() {
    return fansUid;
  }

  public void setFansUid(long fansUid) {
    this.fansUid = fansUid;
  }


  public long getBlacklistUid() {
    return blacklistUid;
  }

  public void setBlacklistUid(long blacklistUid) {
    this.blacklistUid = blacklistUid;
  }


  public long getExperience() {
    return experience;
  }

  public void setExperience(long experience) {
    this.experience = experience;
  }


  public long getHealthDegree() {
    return healthDegree;
  }

  public void setHealthDegree(long healthDegree) {
    this.healthDegree = healthDegree;
  }


  public long getHonorDegree() {
    return honorDegree;
  }

  public void setHonorDegree(long honorDegree) {
    this.honorDegree = honorDegree;
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
