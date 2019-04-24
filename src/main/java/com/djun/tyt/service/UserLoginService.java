package com.djun.tyt.service;

import com.djun.tyt.model.TUser;

import java.util.List;

public interface UserLoginService {
    // 账号登录
    List<TUser> login(String uName,String password);
    // 电话号码登录
    List<TUser> login2(String uName, String password);
}
