package com.djun.tyt.model;

import java.util.Date;

/**
 * 用户信息表
 */
public class TUser {

  private long id;
  // 唯一用户名，不可修改如微信号
  private String uname;
  // 登录密码
  private String upassword;
  // 用户类型
  private long typeid;
  private String phone;
  private String email;
  // 头像
  private String uimg;
  // 用户等级，默认等级为1
  private long ulevel;
  // 升级所需经验值，默认为50
  private long experience;
  // 健康度，默认60，最高100
  private long healthDegree;
  // 诚信度，默认60，最高1000
  private long honorDegree;
  private Date createTime;

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getUname() {
    return uname;
  }

  public void setUname(String uname) {
    this.uname = uname;
  }


  public String getUpassword() {
    return upassword;
  }

  public void setUpassword(String upassword) {
    this.upassword = upassword;
  }


  public long getTypeid() {
    return typeid;
  }

  public void setTypeid(long typeid) {
    this.typeid = typeid;
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


  public String getUimg() {
    return uimg;
  }

  public void setUimg(String uimg) {
    this.uimg = uimg;
  }


  public long getUlevel() {
    return ulevel;
  }

  public void setUlevel(long ulevel) {
    this.ulevel = ulevel;
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

}
