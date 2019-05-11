package com.djun.tyt.model;

import io.swagger.annotations.ApiModel;

import java.sql.Timestamp;

@ApiModel(description = "用户信息")
public class UserInfo {
    /**
     * 用户id
     */
    private long userId;
    /**
     * 唯一用户名
     */
    private String username;
    /**
     * 用户类型
     */
    private String userType;
    /**
     * 用户电话号码
     */
    private String phone;
    /**
     * 用户的邮箱
     */
    private String email;
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 个性签名
     */
    private String signature;
    /**
     * 头像
     */
    private String userHeadImg;
    /**
     * 用户等级
     */
    private long uLevel;
    /**
     * 个人信息开放程度
     */
    private String userInfoOpenDegree;
    /**
     * 人脸照片
     */
    private String faceImg;
    /**
     * 粉丝数量
     */
    private long fansNum;
    /**
     * 粉丝的Id
     */
    private long fansId;
    /**
     * 黑名单中的userId
     */
    private long blacklistUid;
    /**
     * 经验值
     */
    private long experience;
    /**
     * 健康程度
     */
    private long healthDegree;
    /**
     * 信誉度
     */
    private long honorDegree;
    /**
     * 创建用户的时间
     */
    private java.sql.Timestamp userCreateTime;
    /**
     * 修改个人信息的时间
     */
    private java.sql.Timestamp userUpdateTime;
    /**
     * 用户状态1为正常、0为异常
     */
    private long userStatus;



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

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
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

    public String getUserHeadImg() {
        return userHeadImg;
    }

    public void setUserHeadImg(String userHeadImg) {
        this.userHeadImg = userHeadImg;
    }

    public long getuLevel() {
        return uLevel;
    }

    public void setuLevel(long uLevel) {
        this.uLevel = uLevel;
    }

    public String getUserInfoOpenDegree() {
        return userInfoOpenDegree;
    }

    public void setUserInfoOpenDegree(String userInfoOpenDegree) {
        this.userInfoOpenDegree = userInfoOpenDegree;
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

    public long getFansId() {
        return fansId;
    }

    public void setFansId(long fansId) {
        this.fansId = fansId;
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

    public Timestamp getCreateTime() {
        return userCreateTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.userCreateTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return userUpdateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.userUpdateTime = updateTime;
    }

    public long getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(long userStatus) {
        this.userStatus = userStatus;
    }
}
