package com.djun.tyt.mapper;

import com.djun.tyt.model.UserInfo;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface UserLoginMapper {
    // 账号登录
    List<UserInfo> login(@Param("uName") String uName, @Param("password") String password);
    // 电话号码登录
    List<UserInfo> login2(@Param("mobile") String mobile,@Param("password") String password);
    // 学号或教师账号登录
    List<UserInfo> login3(@Param("account") String account,@Param("password") String password);
}
