package com.djun.tyt.mapper;

import com.djun.tyt.model.Vo.UserRecommendVo;

import java.util.List;

public interface UserRecommendMapper {

    List<UserRecommendVo> recommendFollow();

}
