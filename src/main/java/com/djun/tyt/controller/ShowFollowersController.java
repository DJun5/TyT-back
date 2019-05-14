package com.djun.tyt.controller;

import com.djun.tyt.service.ShowFollowersService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import utils.JSONResult;

import javax.annotation.Resource;

@Api(description = "显示用户关注者")
@RestController
@RequestMapping("/User")
public class ShowFollowersController {
    @Resource
    ShowFollowersService service;

    /**
     *
     * @param userId  用户（粉丝）userId
     * @return ok
     */
    @ApiOperation(value = "用户通过userId查询关注者",notes = "查询用户所有的关注者")
    @RequestMapping(value = "/selectByUserId.do",method= RequestMethod.POST)
    public JSONResult showFollowers(int userId){
        return JSONResult.ok(service.showFollowers(userId));
    }
}
