package com.djun.tyt.mapper;

import com.djun.tyt.model.TUser;


import java.util.List;

public interface UserLoginMapper {
//    @Select("SELECT * FROM u_login l JOIN t_user u on u.id = l.uid WHERE u.u_name = #{uname} and u.`password`=#{password}")
//    String login(@Param("uname") String uname, @Param("password") String password);

    List<TUser> login(String uName,String password);

}
