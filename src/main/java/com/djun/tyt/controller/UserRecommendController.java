package com.djun.tyt.controller;

import com.djun.tyt.service.UserRecommendService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import utils.JSONResult;

import javax.annotation.Resource;

@Api(description = "推荐关注用户的数据")
@RestController
@RequestMapping("/User/recommend")
public class UserRecommendController {
    @Resource
    private UserRecommendService service;

    @ApiOperation(value = "查询被推荐用户的信息",notes = "该接口仅能获取推荐用户的某些信息")
    @RequestMapping(value = {"/queryAll.do","/queryAll*"},method = RequestMethod.GET)
    public JSONResult queryAll(){
        return JSONResult.ok(service.queryAll());
    }
}
