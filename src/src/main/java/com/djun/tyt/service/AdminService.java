package com.djun.tyt.service;

import com.djun.tyt.model.Admin;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdminService {
    void addSubmit(Admin modelName);
    void delete(int id);
    void update(Admin modelName);
    List<Admin> queryAll();

}
