package com.djun.tyt.service;


import com.djun.tyt.model.Vo.UserRecommendVo;

import java.util.List;

public interface UserRecommendService {

    List<UserRecommendVo> recommendFollow();

}
