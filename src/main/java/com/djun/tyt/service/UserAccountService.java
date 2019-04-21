package com.djun.tyt.service;

import com.djun.tyt.model.TUser;

import java.util.List;

public interface UserAccountService {

    void addSubmit(TUser modelName);

    void update(TUser modelName);

    List<TUser> queryAll();
}
