package com.djun.tyt.model.Vo;

import java.util.Date;

/**
 * 动态全部的信息
 */
public class DynamicInfoVo {
    /**
     * InfoId
     */
    private int infoId;
    /**
     * 标题
     */
    private String title;
    /**
     * 图片
     */
    private String infoImg;
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
     * 浏览量
     */
    private long browseVolume;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 类别或标签
     */
    private String infoType;
    /**
     * 公开显示程度
     */
    private String infoOpenDegree;
    /**
     * 状态：0为不显示，1为显示
     */
    private long infoStatus;
    /**
     * 发布者id
     */
    private long userId;
    /**
     * 唯一用户名
     */
    private String username;
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 个性签名
     */
    private String signature;
    /**
     * 电话号码
     */
    private String phone;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 头像
     */
    private String headImg;
    /**
     * 等级
     */
    private int uLevel;
    /**
     * 粉丝数量
     */
    private int fansNum;
    /**
     * 信誉度
     */
    private int honorDegree;
    /**
     * 用户状态：1为正常、0为非正常
     */
    private int userStatus;
    /**
     * 用户信息公开程度
     */
    private String userInfoOpenDegree;

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

    public String getInfoImg() {
        return infoImg;
    }

    public void setInfoImg(String infoImg) {
        this.infoImg = infoImg;
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

    public String getInfoType() {
        return infoType;
    }

    public void setInfoType(String infoType) {
        this.infoType = infoType;
    }

    public String getInfoOpenDegree() {
        return infoOpenDegree;
    }

    public void setInfoOpenDegree(String infoOpenDegree) {
        this.infoOpenDegree = infoOpenDegree;
    }

    public long getInfoStatus() {
        return infoStatus;
    }

    public void setInfoStatus(long infoStatus) {
        this.infoStatus = infoStatus;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public int getuLevel() {
        return uLevel;
    }

    public void setuLevel(int uLevel) {
        this.uLevel = uLevel;
    }

    public int getFansNum() {
        return fansNum;
    }

    public void setFansNum(int fansNum) {
        this.fansNum = fansNum;
    }

    public int getHonorDegree() {
        return honorDegree;
    }

    public void setHonorDegree(int honorDegree) {
        this.honorDegree = honorDegree;
    }

    public int getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(int userStatus) {
        this.userStatus = userStatus;
    }

    public String getUserInfoOpenDegree() {
        return userInfoOpenDegree;
    }

    public void setUserInfoOpenDegree(String userInfoOpenDegree) {
        this.userInfoOpenDegree = userInfoOpenDegree;
    }
}
