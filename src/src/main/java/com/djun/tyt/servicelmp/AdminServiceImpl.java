package com.djun.tyt.servicelmp;

import com.djun.tyt.mapper.AdminMapper;
import com.djun.tyt.service.AdminService;
import com.djun.tyt.model.Admin;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;
@Service
public class AdminServiceImpl implements AdminService {

//    @Autowired
    @Resource
    private AdminMapper mapper;
    @Override
    public void addSubmit(Admin modelName) {
        mapper.addSubmit(modelName);
    }

    @Override
    public void update(Admin modelName) {
        mapper.update(modelName);
    }

    @Override
    public void delete(int id) {
        mapper.delete(id);
    }

    @Override
    public List<Admin> queryAll() {
        return mapper.queryAll();
    }
}
/*
 * Propagation.REQUIRED
 * 如果当前存在事务，则加入该事务，如果当前不存在事务，则创建一个新的事务。
 *
 * Propagation.SUPPORTS
 * 如果当前存在事务，则加入该事务；如果当前不存在事务，则以非事务的方式继续运行。
 *
 * Propagation.MANDATORY
 * 如果当前存在事务，则加入该事务；如果当前不存在事务，则抛出异常。
 *
 * Propagation.REQUIRES_NEW
 * 重新创建一个新的事务，如果当前存在事务，暂停当前的事务。这个属性可以实现：
 * 类A中的a方法加上默认注解@Transactional(propagation = Propagation.REQUIRED)，
 * 类B中的b方法加上注解@Transactional(propagation = Propagation.REQUIRES_NEW)，
 * 然后在a方法中调用b方法操作数据库，再在a方法最后抛出异常，
 * 会发现a方法中的b方法对数据库的操作没有回滚，
 * 因为Propagation.REQUIRES_NEW会暂停a方法的事务。
 *
 * Propagation.NOT_SUPPORTED
 * 以非事务的方式运行，如果当前存在事务，暂停当前的事务。
 *
 *Propagation.NEVER
 * 以非事务的方式运行，如果当前存在事务，则抛出异常。
 *
 * Propagation.NESTED
 * 和 Propagation.REQUIRED 效果一样。
 */