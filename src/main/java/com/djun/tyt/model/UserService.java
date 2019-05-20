package com.djun.tyt.model;

import java.util.Date;

public class UserService {
    /**
     *
     */
    private Integer userId;
    /**
     *
     */
    private int serviceId;
    /**
     * 客户名
     */
    private String serviceName;
    /**
     * 服务描述
     */
    private String serviceDescription;

    /**
     * createTime
     */
    private Date serviceCreateTime;
    /**
     *
     */
    private Date updateServiceTime;
    /**
     * 开关状态
     */
    private int serviceStatus;
    /**
     *
     */
    private String serviceType;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public Date getServiceCreateTime() {
        return serviceCreateTime;
    }

    public void setServiceCreateTime(Date serviceCreateTime) {
        this.serviceCreateTime = serviceCreateTime;
    }

    public Date getUpdateServiceTime() {
        return updateServiceTime;
    }

    public void setUpdateServiceTime(Date updateServiceTime) {
        this.updateServiceTime = updateServiceTime;
    }

    public int getServiceStatus() {
        return serviceStatus;
    }

    public void setServiceStatus(int serviceStatus) {
        this.serviceStatus = serviceStatus;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
}
