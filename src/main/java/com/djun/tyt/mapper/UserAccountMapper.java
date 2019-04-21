package com.djun.tyt.mapper;

import com.djun.tyt.model.TUser;

import java.util.List;

public interface UserAccountMapper {

    void addSubmit(TUser modelName);

    void update(TUser modelName);

    List<TUser> queryAll();
}
