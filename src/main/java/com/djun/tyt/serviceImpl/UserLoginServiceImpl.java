package com.djun.tyt.serviceImpl;

import com.djun.tyt.mapper.UserLoginMapper;
import com.djun.tyt.model.UserInfo;
import com.djun.tyt.service.UserLoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserLoginServiceImpl implements UserLoginService {
    @Resource
    private UserLoginMapper mapper;
    @Override
    public List<UserInfo> login(String uName, String password) {
        return mapper.login(uName,password);
    }
    @Override
    public List<UserInfo> login2(String mobile, String password) {
        return mapper.login2(mobile,password);
    }
    @Override
    public List<UserInfo> login3(String account, String password) {
        return mapper.login3(account,password);
    }

}
