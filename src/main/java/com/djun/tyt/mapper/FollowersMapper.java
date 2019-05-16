package com.djun.tyt.mapper;

import com.djun.tyt.model.Pojo.UFans;
import com.djun.tyt.model.UserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FollowersMapper {
    /**
     * 显示该用户所有的关注者
     * @param userId  当前登录用户的id
     * @return  ok
     */
    List<UserInfo> showFollowers(int userId);

    /**
     * 新增一条关注记录
     * @param modelName 将uid、fan_id、status、create_time传入后台
     */
    void addFollowers(UFans modelName);

    /**
     * 查询当前登录用户是否关注过目前正在关注的用户
     * @param modelName 将uid、fan_id传入后台
     */
    List<UFans> selectFollwers(UFans modelName);

    /**
     * 如果当前登录用户关注过目前正在关注的用户，修改status字段为1
     * @param modelName  将uid、fan_id、status、update_time传入后台
     */
    void updateFollower(UFans modelName);

    /**
     * 取消对此关注者的关注,修改status字段为0
     * @param modelName 将uid、fan_id、status、update_time传入后台
     * @return ok
     */
    void cancelFollower(UFans modelName);
}
