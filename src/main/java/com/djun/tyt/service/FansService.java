package com.djun.tyt.service;

import com.djun.tyt.model.UserInfo;
import java.util.List;

public interface FansService {
    List<UserInfo> showFans(int userId);
    void delete(int uid);
}
