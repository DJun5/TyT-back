package com.djun.tyt.service;

import com.djun.tyt.model.UserInfo;
import java.util.List;

public interface ShowFansService {
    List<UserInfo> showFans(int userId);
}
