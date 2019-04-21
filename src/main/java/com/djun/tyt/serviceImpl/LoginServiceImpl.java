package com.djun.tyt.serviceImpl;

import com.djun.tyt.mapper.LoginMapper;
import com.djun.tyt.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class LoginServiceImpl implements LoginService {
    @Resource
    private LoginMapper mapper;

    @Override
    public List<TUser> confirmByUsername(TUser modelName) {
        return mapper.confirmByUsername(modelName);
    }

    @Override
    public List<TUser> confirmByMobile(TUser modelName) {
        return mapper.confirmByMobile(modelName);
    }

    @Override
    public void addSubmit(ULogin modelName) {
        mapper.addSubmit(modelName);
    }

    @Override
    public void update(ULogin modelName) {
        mapper.update(modelName);
    }
}
