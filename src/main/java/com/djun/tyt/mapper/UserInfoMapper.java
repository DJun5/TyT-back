package com.djun.tyt.mapper;

import com.djun.tyt.model.UserInfo;
import org.apache.catalina.User;

import java.util.List;

public interface UserInfoMapper {
    //根据用户id查询用户信息
    List<UserInfo> queryById(int id);
    //根据用户id修改用户信息
    void update(UserInfo modelName);
}
