package com.djun.tyt.controller;

import com.djun.tyt.model.UserInfo;
import com.djun.tyt.service.UserInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import utils.JSONResult;

import javax.annotation.Resource;
import java.util.Date;


@Api(value = "个人用户信息")
@RestController
@RequestMapping("/query")
public class UserInfoController {
    @Resource
    UserInfoService service;

    /**
     *
     * @param id  用户id
     * @return ok
     */

    @ApiOperation(value ="根据用户id查询用户信息",notes ="")
    @RequestMapping(value = "",method = RequestMethod.GET)
    public JSONResult queryById(int id){
        return JSONResult.ok(service.queryById(id));
    }
    /*
        id:用户id
        photo：用户头像
        name：用户名
        identity：身份（例如：学生）
        professional：专业
        department：系部
        Colleges：院校
        hometown：家乡
        phone：手机号
     */

    /**
     *
     * @param model 个人用户信息数据
     * @return ok
     */
    @ApiOperation(value = "根据用户id修改用户信息",notes = "")
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public JSONResult update(UserInfo model){
        model.setUserUpdateTime(new Date());
        service.update(model);
        return JSONResult.ok("修改成功");
    }
}
