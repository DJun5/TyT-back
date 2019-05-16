package com.djun.tyt.model.Pojo;


import java.util.Date;

public class TUser {

  private long id;
  private String uName;
  private long tid;
  private String phone;
  private String email;
  private String nickname;
  private String signature;
  private String headImg;
  private long uLevel;
  private long oid;
  private String faceImg;
  private long fansNum;
  private long blacklistUid;
  private long experience;
  private long healthDegree;
  private long honorDegree;
  private Date createTime;
  private Date updateTime;
  private long status;


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


  public long getTid() {
    return tid;
  }

  public void setTid(long tid) {
    this.tid = tid;
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


  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }


  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
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


  public long getOid() {
    return oid;
  }

  public void setOid(long oid) {
    this.oid = oid;
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


  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }


  public Date getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }

}
