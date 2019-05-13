package com.djun.tyt.mapper;

import com.djun.tyt.model.UserInfo;
import java.util.List;

public interface ShowFansMapper {
    List<UserInfo> showFans(int userId);
}
