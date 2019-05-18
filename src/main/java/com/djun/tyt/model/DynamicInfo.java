package com.djun.tyt.model;

import io.swagger.annotations.ApiModel;
import java.util.Date;

@ApiModel(description = "用户发布的动态信息")
public class DynamicInfo {
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
    private String infoImg1;
    private String infoImg2;
    private String infoImg3;
    private String infoImg4;
    private String infoImg5;
    private String infoImg6;
    private String infoImg7;
    private String infoImg8;
    private String infoImg9;
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
    private Date dynamicCreateTime;
    /**
     * 修改时间
     */
    private Date dynamicUpdateTime;
    /**
     * 类别或标签
     */
    private String dynamicType;
    /**
     * 公开显示程度
     */
    private String dynamicOpenDegree;
    /**
     * 状态：0为不显示，1为显示
     */
    private long dynamicStatus;
    /**
     * 发布者id
     */
    private long userId;

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

    public String getInfoImg1() {
        return infoImg1;
    }

    public void setInfoImg1(String infoImg1) {
        this.infoImg1 = infoImg1;
    }

    public String getInfoImg2() {
        return infoImg2;
    }

    public void setInfoImg2(String infoImg2) {
        this.infoImg2 = infoImg2;
    }

    public String getInfoImg3() {
        return infoImg3;
    }

    public void setInfoImg3(String infoImg3) {
        this.infoImg3 = infoImg3;
    }

    public String getInfoImg4() {
        return infoImg4;
    }

    public void setInfoImg4(String infoImg4) {
        this.infoImg4 = infoImg4;
    }

    public String getInfoImg5() {
        return infoImg5;
    }

    public void setInfoImg5(String infoImg5) {
        this.infoImg5 = infoImg5;
    }

    public String getInfoImg6() {
        return infoImg6;
    }

    public void setInfoImg6(String infoImg6) {
        this.infoImg6 = infoImg6;
    }

    public String getInfoImg7() {
        return infoImg7;
    }

    public void setInfoImg7(String infoImg7) {
        this.infoImg7 = infoImg7;
    }

    public String getInfoImg8() {
        return infoImg8;
    }

    public void setInfoImg8(String infoImg8) {
        this.infoImg8 = infoImg8;
    }

    public String getInfoImg9() {
        return infoImg9;
    }

    public void setInfoImg9(String infoImg9) {
        this.infoImg9 = infoImg9;
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

    public String getDynamicType() {
        return dynamicType;
    }

    public void setDynamicType(String dynamicType) {
        this.dynamicType = dynamicType;
    }

    public String getDynamicOpenDegree() {
        return dynamicOpenDegree;
    }

    public void setDynamicOpenDegree(String dynamicOpenDegree) {
        this.dynamicOpenDegree = dynamicOpenDegree;
    }

    public Date getDynamicCreateTime() {
        return dynamicCreateTime;
    }

    public void setDynamicCreateTime(Date dynamicCreateTime) {
        this.dynamicCreateTime = dynamicCreateTime;
    }

    public Date getDynamicUpdateTime() {
        return dynamicUpdateTime;
    }

    public void setDynamicUpdateTime(Date dynamicUpdateTime) {
        this.dynamicUpdateTime = dynamicUpdateTime;
    }

    public long getDynamicStatus() {
        return dynamicStatus;
    }

    public void setDynamicStatus(long dynamicStatus) {
        this.dynamicStatus = dynamicStatus;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
}
