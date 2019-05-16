package com.djun.tyt.mapper;

import com.djun.tyt.model.UserInfo;
import java.util.List;

public interface FansMapper {
    /**
     * 查询所有的粉丝
     * @param userId 被关注者id
     * @return
     */
    List<UserInfo> showFans(int userId);

    /**
     * 删除用户所有的粉丝
     * @param uid 被关注者id
     */
    void delete(int uid);
}
