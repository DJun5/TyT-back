package com.djun.tyt.serviceImpl;

import com.djun.tyt.mapper.ShowFollowersMapper;
import com.djun.tyt.model.UserInfo;
import com.djun.tyt.service.ShowFollowersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ShowFollowersServiceImpI implements ShowFollowersService {
    @Resource
    ShowFollowersMapper mapper;
    @Override
    public List<UserInfo> showFollowers(int userId) {
        return mapper.showFollowers(userId);
    }
}
