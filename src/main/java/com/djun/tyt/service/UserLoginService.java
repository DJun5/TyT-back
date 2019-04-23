package com.djun.tyt.service;

import com.djun.tyt.model.TUser;

import java.util.List;

public interface UserLoginService {
    List<TUser> login(String uName, String password);
}
