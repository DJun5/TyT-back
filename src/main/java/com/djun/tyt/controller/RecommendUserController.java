package com.djun.tyt.controller;

import com.djun.tyt.service.RecommendUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import utils.JSONResult;

import javax.annotation.Resource;

@Api(description = "推荐关注用户的数据")
@RestController
@RequestMapping("/User")
public class RecommendUserController {
    @Resource
    private RecommendUserService service;

    @ApiOperation(value = "查询被推荐用户的信息",notes = "该接口仅能获取推荐用户的某些信息")
    @RequestMapping(value = "/recommend",method = RequestMethod.GET)
    public JSONResult recommendFollow(){
        return JSONResult.ok(service.recommendFollow());
    }
}
