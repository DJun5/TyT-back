package com.djun.tyt.serviceImpl;

import com.djun.tyt.mapper.UserRecommendMapper;
import com.djun.tyt.model.UserInfo;
import com.djun.tyt.service.UserRecommendService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserRecommendServiceImpl implements UserRecommendService {
    @Resource
    private UserRecommendMapper mapper;

    @Override
    public List<UserInfo> queryAll() {
        return mapper.queryAll();
    }
}
