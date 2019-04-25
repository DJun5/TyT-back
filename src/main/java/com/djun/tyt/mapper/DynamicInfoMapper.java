package com.djun.tyt.mapper;


import com.djun.tyt.model.Vo.DynamicInfoVo;

import java.util.List;

public interface DynamicInfoMapper {
    // 查询全部动态信息
    List<DynamicInfoVo> queryAll();
    // 通过发布者的userId来查询动态信息
    List<DynamicInfoVo> selectedByUserId(int userId);
    // 通过动态的id来查询动态信息
    List<DynamicInfoVo> selectedByInfoId(int infoId);

}
