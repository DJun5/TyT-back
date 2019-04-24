package com.djun.tyt.mapper;

import com.djun.tyt.model.TUser;

import java.util.List;

public interface RecommendUserMapper {

    List<TUser> recommendFollow();

}
