package com.djun.tyt.serviceImpl;

import com.djun.tyt.mapper.AdminMapper;
import com.djun.tyt.model.Admin;
import com.djun.tyt.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class AdminServiceImpl implements AdminService {
    @Resource
    private AdminMapper mapper;
    @Override
    public void addSubmit(Admin modelName) {
        mapper.addSubmit(modelName);
    }

    @Override
    public void delete(Integer id) {
        mapper.delete(id);
    }

    @Override
    public void update(int id,String pwd) {
        mapper.update(id,pwd);
    }

    @Override
    public List<Admin> queryAll() {
        return mapper.queryAll();
    }
}
