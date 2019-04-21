package com.djun.tyt.service;

import com.djun.tyt.model.Admin;

import java.util.List;

public interface AdminService {
    void addSubmit(Admin modelName);

    void delete(Integer id);

    void update(int id,String pwd);

    List<Admin> queryAll();

//    List<Admin> queryById(int id);
}
