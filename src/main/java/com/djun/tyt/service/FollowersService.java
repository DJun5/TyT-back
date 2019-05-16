package com.djun.tyt.service;

import com.djun.tyt.model.Pojo.UFans;
import com.djun.tyt.model.UserInfo;
import java.util.List;

public interface FollowersService {
    List<UserInfo> showFollowers(int userId);
    void addFollowers(UFans model);
    List<UFans> selectFollwers(UFans model);
    void updateFollower(UFans model);
    void cancelFollower(UFans model);
}
