package com.djun.tyt.model;

import java.util.Date;

/**
 * 动态全部的信息
 */
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
    private String img;

    /**
     * 类别
     */
    private String infoType;

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
     * 修改时间
     */
    private Date updateTime;

    /**
     * 类别名或标签
     */
    private String fName;

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

}
