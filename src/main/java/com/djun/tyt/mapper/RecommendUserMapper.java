package com.djun.tyt.mapper;

import com.djun.tyt.model.Vo.RecommendUserVo;

import java.util.List;

public interface RecommendUserMapper {

    List<RecommendUserVo> recommendFollow();

}
