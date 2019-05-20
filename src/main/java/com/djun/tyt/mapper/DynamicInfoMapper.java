package com.djun.tyt.mapper;


import com.djun.tyt.model.DynamicInfo;

import java.util.List;

public interface DynamicInfoMapper {
    /**
     * 查询全部动态信息
     */
    List<DynamicInfo> queryAll();

    /**
     * 通过发布者的userId来查询动态信息
     * @param userId 发布者的用户id
     * @return 所有与动态有关的数据包
     */
    List<DynamicInfo> selectedByUserId(int userId);

    /**
     * 通过发布者id新增动态
     * @param model 发布者发布一条动态将用户id、公开程度、标题、内容、动态是否显示参数一并传入后台
     */
    void AddDynamic(DynamicInfo model);

    /**
     *
     * @param id 当前登录者id
     * @return 动态信息
     */
    List<DynamicInfo> queryDynamic(int id);

    /**
     * 通过infoId修改动态信息
     * @param model 动态信息
     */
    void updateDynamic(DynamicInfo model);

    /**
     * 通过infoId删除动态信息
     * @param infoId 动态表主键
     */
    void deleteDynamic(int infoId);
}
