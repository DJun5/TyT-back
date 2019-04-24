package com.djun.tyt.mapper;


import com.djun.tyt.model.TUser;

import java.util.List;

public interface UserLoginMapper {
    // 账号登录
    List<TUser> login(String uName, String password);
    // 电话号码登录
    List<TUser> login2(String mobile,String password);
    // 学号或教师账号登录
    List<TUser> login3(String account,String password);

}
