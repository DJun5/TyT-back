package com.djun.tyt.mapper;


import com.djun.tyt.model.UserService;

import java.util.List;

public interface UserServiceMapper {

    List<UserService> selectByServiceId(int serviceId);

    void update(UserService modelName);
}