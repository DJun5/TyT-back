package com.djun.tyt.serviceImpl;

import com.djun.tyt.mapper.ShowFansMapper;
import com.djun.tyt.model.UserInfo;
import com.djun.tyt.service.ShowFansService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class ShowFansServiceImpI implements ShowFansService {
    @Resource
    ShowFansMapper mapper;
    public List<UserInfo> showFans(int userId){
        return mapper.showFans(userId);
    }
}
