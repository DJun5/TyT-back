package com.djun.tyt.service;

import java.util.List;

public interface UserAccountService {

    void addSubmit(TUser modelName);

    void update(TUser modelName);

    List<TUser> queryAll();
}
