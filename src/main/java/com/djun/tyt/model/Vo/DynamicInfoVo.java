package com.djun.tyt.model.Vo;


import java.util.Date;

/**
 * 动态全部的信息
 */
public class DynamicInfoVo {
    /**
     * id
     */
    private Integer infoId;
    /**
     * 标题
     */
    private String title;
    /**
     * 图片
     */
    private String img;
    /**
     * 内容
     */
    private String content;
    /**
     * 点赞数
     */
    private long praise;
    /**
     * 转发数
     */
    private long forward;
    /**
     * 状态：0为不显示，1为显示
     */
    private long status;
    /**
     * 浏览量
     */
    private long browseVolume;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 一级分类名
     */
    private String fName;
    /**
     * 二级分类名
     */
    private String sName;
    /**
     * 三级分类名
     */
    private String tName;
    /**
     * 公开显示程度
     */
    private String openDegree;

    public int getInfoId() {
        return infoId;
    }

    public void setInfoId(int infoId) {
        this.infoId = infoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
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

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String getOpenDegree() {
        return openDegree;
    }

    public void setOpenDegree(String openDegree) {
        this.openDegree = openDegree;
    }
}
