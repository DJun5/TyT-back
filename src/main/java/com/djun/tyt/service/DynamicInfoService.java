package com.djun.tyt.service;


import com.djun.tyt.model.DynamicInfo;
import com.djun.tyt.model.Vo.UploadVo;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface DynamicInfoService {
    List<DynamicInfo> queryAll();
    List<DynamicInfo> selectedByUserId(int userId);
    void AddDynamic(DynamicInfo model);
    List<DynamicInfo> queryDynamic(int id);
    void updateDynamic(DynamicInfo model);
    void deleteDynamic(int infoId);
    void passImg();
}
