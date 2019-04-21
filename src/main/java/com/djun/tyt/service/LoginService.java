package com.djun.tyt.service;

import java.util.List;

public interface LoginService {
    // 账号+密码登录
    List<TUser> confirmByUsername(TUser modelName);
    // 手机号码+密码登录
    List<TUser> confirmByMobile(TUser modelName);
    // 存入登录信息
    void addSubmit(ULogin modelName);
    // 更新上一次的登录信息
    void update(ULogin modelName);

}
