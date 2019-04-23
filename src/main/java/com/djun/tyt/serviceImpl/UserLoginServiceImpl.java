package com.djun.tyt.serviceImpl;

import com.djun.tyt.mapper.UserLoginMapper;
import com.djun.tyt.model.TUser;
import com.djun.tyt.service.UserLoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserLoginServiceImpl implements UserLoginService {
    @Resource
    private UserLoginMapper mapper;
    @Override
    public List<TUser> login(String uName, String password) {
        return mapper.login(uName,password);
    }
}
