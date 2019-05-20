package com.djun.tyt.service;

import com.djun.tyt.model.UserService;
import com.djun.tyt.model.Vo.UServiceVo;


import java.util.List;

public interface UserServiceService {
    //根据用户id查询用户信息
    List<UserService> selectByServiceId(int serviceId);
    //修改用户信息
    void update(UserService modelName);
}
