package com.djun.tyt.service;

import com.djun.tyt.model.UserInfo;

import java.util.List;

public interface UserLoginService {
    // 账号登录
    List<UserInfo> login(String uName, String password);
    // 电话号码登录
    List<UserInfo> login2(String uName, String password);
    // 学号或教师账号登录
    List<UserInfo> login3(String account,String password);
}
