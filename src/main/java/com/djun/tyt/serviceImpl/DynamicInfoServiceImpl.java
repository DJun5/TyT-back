package com.djun.tyt.serviceImpl;

import com.djun.tyt.mapper.DynamicInfoMapper;
import com.djun.tyt.model.DynamicInfo;
import com.djun.tyt.model.Vo.UploadVo;
import com.djun.tyt.service.DynamicInfoService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.util.List;
import java.util.UUID;

@Service
public class DynamicInfoServiceImpl implements DynamicInfoService {
    @Resource
    private DynamicInfoMapper mapper;

    @Override
    public List<DynamicInfo> queryAll() {
        return mapper.queryAll();
    }

    @Override
    public List<DynamicInfo> selectedByUserId(int userId) {
        return mapper.selectedByUserId(userId);
    }

    @Override
    public void AddDynamic(DynamicInfo model){
        mapper.AddDynamic(model);
    }
    @Override
    public List<DynamicInfo> queryDynamic(int id){
        return mapper.queryDynamic(id);
    }

    @Override
    public void updateDynamic(DynamicInfo model){
        mapper.updateDynamic(model);
    }

    @Override
    public void deleteDynamic(int infoId){
        mapper.deleteDynamic(infoId);
    }
}
