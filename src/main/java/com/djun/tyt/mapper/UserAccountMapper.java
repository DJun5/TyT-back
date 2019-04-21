package com.djun.tyt.mapper;

import java.util.List;

public interface UserAccountMapper {

    void addSubmit(TUser modelName);

    void update(TUser modelName);

    List<TUser> queryAll();
}
