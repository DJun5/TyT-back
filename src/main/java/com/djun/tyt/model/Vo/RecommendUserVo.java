package com.djun.tyt.model.Vo;

/**
 * 被推荐用户的信息
 */
public class RecommendUserVo {
    /**
     * id
     */
    private String userId;
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
    private String headImg;
    /**
     * 粉丝量
     */
    private int fansNum;
    /**
     * 账号
     */
    private String uName;
    /**
     * 获赞数
     */
    private int praise;
    /**
     * 收藏数
     */
    private int collection;
    /**
     * 用户等级
     */
    private int uLevel;
    /**
     * 信誉度
     */
    private int honorDegree;
    /**
     * 公开程度
     */
    private int openDegree;


    public int getuLevel() {
        return uLevel;
    }

    public int getHonorDegree() {
        return honorDegree;
    }

    public void setHonorDegree(int honorDegree) {
        this.honorDegree = honorDegree;
    }

    public int getOpenDegree() {
        return openDegree;
    }

    public void setOpenDegree(int openDegree) {
        this.openDegree = openDegree;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public int getFansNum() {
        return fansNum;
    }

    public void setFansNum(int fansNum) {
        this.fansNum = fansNum;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public int getPraise() {
        return praise;
    }

    public void setPraise(int praise) {
        this.praise = praise;
    }

    public int getCollection() {
        return collection;
    }

    public void setCollection(int collection) {
        this.collection = collection;
    }
}
