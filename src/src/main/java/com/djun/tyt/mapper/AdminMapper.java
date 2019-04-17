package com.djun.tyt.mapper;

import com.djun.tyt.model.Admin;

import java.util.List;

public interface AdminMapper {
    void addSubmit(Admin modelName);
    void delete(int id);
    void update(Admin modelName);
    List<Admin> queryAll();
}
