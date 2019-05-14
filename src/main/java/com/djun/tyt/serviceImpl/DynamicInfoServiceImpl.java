package com.djun.tyt.serviceImpl;

import com.djun.tyt.mapper.DynamicInfoMapper;
import com.djun.tyt.model.DynamicInfo;
import com.djun.tyt.service.DynamicInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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

}
