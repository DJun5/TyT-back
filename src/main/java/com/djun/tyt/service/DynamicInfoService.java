package com.djun.tyt.service;


import com.djun.tyt.model.Vo.DynamicInfoVo;

import java.util.List;

public interface DynamicInfoService {
    List<DynamicInfoVo> queryAll();
    List<DynamicInfoVo> selectedByUserId(int userId);
    List<DynamicInfoVo> selectedByInfoId(int infoId);
}
