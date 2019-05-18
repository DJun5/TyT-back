package com.djun.tyt.serviceImpl;

import com.djun.tyt.mapper.UserServiceMapper;
import com.djun.tyt.model.UserService;
import com.djun.tyt.model.Vo.UServiceVo;
import com.djun.tyt.service.UserServiceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceServiceImpl implements UserServiceService {
    @Resource
    private UserServiceMapper mapper;
    @Override
    public List<UserService> selectByServiceId(int serviceId){return mapper.selectByServiceId(serviceId);}
    @Override
    public void update(UserService modelName){
        mapper.update(modelName);
    }

}
