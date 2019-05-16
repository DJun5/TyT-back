package com.djun.tyt.serviceImpl;

import com.djun.tyt.mapper.FansMapper;
import com.djun.tyt.model.UserInfo;
import com.djun.tyt.service.FansService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class FansServiceImpI implements FansService {
    @Resource
    FansMapper mapper;
    public List<UserInfo> showFans(int userId){
        return mapper.showFans(userId);
    }
    public void delete(int uid){
        mapper.delete(uid);
    }
}
