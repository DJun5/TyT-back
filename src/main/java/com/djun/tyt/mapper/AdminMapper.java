package com.djun.tyt.mapper;

import com.djun.tyt.model.Admin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface AdminMapper {

    void addSubmit(Admin modelName);

    void delete(Integer id);

    void update(int id,String pwd);

    List<Admin> queryAll();

//    List<Admin> queryById(int id);
}
