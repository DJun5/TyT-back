package com.djun.tyt.service;

import com.djun.tyt.model.TUser;

import java.util.List;

public interface UserAccountService {
    /**
     * 增加账户
     * @param modelName 用户基本信息
     *                  uname
     *                  upassword
     *                  phone
     *                  email
     *                  uimg
     */
    void addSubmit(TUser modelName);

    /**
     * 修改账户数据
     * @param modelName upassword
     *                  phone
     *                  email
     *                  uimg
     */
    void update(TUser modelName);

    List<TUser> queryAll();
}
