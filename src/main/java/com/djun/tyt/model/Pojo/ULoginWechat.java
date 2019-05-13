package com.djun.tyt.model.Pojo;


public class ULoginWechat {

  private long id;
  private long openid;
  private String img;
  private String name;
  private String account;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getOpenid() {
    return openid;
  }

  public void setOpenid(long openid) {
    this.openid = openid;
  }


  public String getImg() {
    return img;
  }

  public void setImg(String img) {
    this.img = img;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

}
