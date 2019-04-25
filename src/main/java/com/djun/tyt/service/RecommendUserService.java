package com.djun.tyt.service;


import com.djun.tyt.model.Vo.RecommendUserVo;

import java.util.List;

public interface RecommendUserService {

    List<RecommendUserVo> recommendFollow();

}
