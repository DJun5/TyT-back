package com.djun.tyt.serviceImpl;

import com.djun.tyt.mapper.RecommendUserMapper;
import com.djun.tyt.model.TUser;
import com.djun.tyt.service.RecommendUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class RecommendUserServiceImpl implements RecommendUserService {
    @Resource
    private RecommendUserMapper mapper;
    @Override
    public List<TUser> recommendFollow() {
        return mapper.recommendFollow();
    }
}
