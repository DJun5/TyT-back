package com.djun.tyt.service;


import com.djun.tyt.model.DynamicInfo;

import java.util.List;

public interface DynamicInfoService {
    List<DynamicInfo> queryAll();
    List<DynamicInfo> selectedByUserId(int userId);
}
