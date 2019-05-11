package com.djun.tyt.service;

public interface UserLoginService {
    // 账号登录
    int login(String uName,String password);
    // 电话号码登录
    int login2(String uName, String password);
    // 学号或教师账号登录
    int login3(String account,String password);
}
