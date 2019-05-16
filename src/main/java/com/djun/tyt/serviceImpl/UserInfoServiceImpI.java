package com.djun.tyt.serviceImpl;

import com.djun.tyt.mapper.UserInfoMapper;
import com.djun.tyt.model.UserInfo;
import com.djun.tyt.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserInfoServiceImpI implements UserInfoService {
    @Resource
    private UserInfoMapper mapper;
    @Override
    public List<UserInfo> queryAll(){
        return mapper.queryAll();
    }

    @Override
    public void update(UserInfo modelName) {
        mapper.update(modelName);
    }
}
