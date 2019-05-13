package com.djun.tyt.model.Pojo;


public class UPhonebook {

  private long id;
  private long uid;
  private String name;
  private String infoTitle;
  private String info;
  private long typeId;


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


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getInfoTitle() {
    return infoTitle;
  }

  public void setInfoTitle(String infoTitle) {
    this.infoTitle = infoTitle;
  }


  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }


  public long getTypeId() {
    return typeId;
  }

  public void setTypeId(long typeId) {
    this.typeId = typeId;
  }

}
