package com.djun.tyt.serviceImpl;

import com.djun.tyt.mapper.FollowersMapper;
import com.djun.tyt.model.Pojo.UFans;
import com.djun.tyt.model.UserInfo;
import com.djun.tyt.service.FollowersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FollowersServiceImpI implements FollowersService {
    @Resource
    FollowersMapper mapper;
    @Override
    public List<UserInfo> showFollowers(int userId) {
        return mapper.showFollowers(userId);
    }
    @Override
    public void addFollowers(UFans model){
         mapper.addFollowers(model);
    }
    @Override
    public List<UFans> selectFollwers(UFans model){
        return mapper.selectFollwers(model);
    }
    @Override
    public void updateFollower(UFans model){
         mapper.updateFollower(model);
    }
    @Override
    public void cancelFollower(UFans model) {
         mapper.cancelFollower(model);
    }
}
