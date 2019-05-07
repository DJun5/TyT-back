package com.djun.tyt.model;

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
    private long userInfoOpenDegree;
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
    private java.sql.Timestamp createTime;
    /**
     * 修改个人信息的时间
     */
    private java.sql.Timestamp updateTime;
    /**
     * 用户状态1为正常、2为注销
     */
    private long status;
}
