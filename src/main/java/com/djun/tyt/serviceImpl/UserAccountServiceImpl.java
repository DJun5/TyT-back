package com.djun.tyt.serviceImpl;

import com.djun.tyt.mapper.UserAccountMapper;
import com.djun.tyt.model.TUser;
import com.djun.tyt.service.UserAccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserAccountServiceImpl implements UserAccountService {

    @Resource
    private UserAccountMapper mapper;
    @Override
    public void addSubmit(TUser modelName) {
        mapper.addSubmit(modelName);
    }

    @Override
    public void update(TUser modelName) {
        mapper.update(modelName);
    }

    @Override
    public List<TUser> queryAll() {
      return  mapper.queryAll();
    }

}
