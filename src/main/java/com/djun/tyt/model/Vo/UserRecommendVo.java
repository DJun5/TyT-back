package com.djun.tyt.model.Vo;

import com.djun.tyt.model.DynamicInfo;
import com.djun.tyt.model.UserInfo;
import io.swagger.annotations.ApiModel;

@ApiModel(description = "被推荐关注的用户信息")
public class UserRecommendVo {

    private UserInfo userInfo;
    private DynamicInfo dynamicInfo;

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public DynamicInfo getDynamicInfo() {
        return dynamicInfo;
    }

    public void setDynamicInfo(DynamicInfo dynamicInfo) {
        this.dynamicInfo = dynamicInfo;
    }
}
