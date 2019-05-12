package com.djun.tyt.mapper;


import com.djun.tyt.model.Vo.DynamicInfoVo;

import java.util.List;

public interface DynamicInfoMapper {
    /**
     * 查询全部动态信息
     */
    List<DynamicInfoVo> queryAll();

    /**
     * 通过发布者的userId来查询动态信息
     * @param userId 发布者的用户id
     * @return 所有与动态有关的数据包
     */
    List<DynamicInfoVo> selectedByUserId(int userId);

}
