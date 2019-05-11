package com.djun.tyt.model.Vo;

import com.djun.tyt.model.DynamicInfo;
import com.djun.tyt.model.UserInfo;
import io.swagger.annotations.ApiModel;

import java.util.List;

@ApiModel(description = "被推荐关注的用户信息")
public class UserRecommendVo extends UserInfo {

    private List<DynamicInfo> DynamicInfo;

    public List<DynamicInfo> getDynamicInfo() {
        return DynamicInfo;
    }

    public void setDynamicInfo(List<DynamicInfo> dynamicInfo) {
        DynamicInfo = dynamicInfo;
    }
}
