package com.djun.tyt.controller;

import com.djun.tyt.service.DynamicInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import utils.JSONResult;

import javax.annotation.Resource;

import static org.springframework.util.ObjectUtils.isEmpty;

@Api(description = "用户动态数据")
@RestController
@RequestMapping("/Dynamic")
public class DynamicInfoController {
    @Resource
    private DynamicInfoService service;

    @ApiOperation(value = "获取全部动态数据",notes = "暂时后台未考虑分页，一次就取出全部数据")
    @RequestMapping(value = "/queryAll",method = RequestMethod.GET)
    public JSONResult queryAll(){
        return JSONResult.ok(service.queryAll());
    }

    @ApiOperation(value = "通过userId获取某用户动态数据",notes = "userId")
    @RequestMapping(value = "/selectedByUserId",method = RequestMethod.POST)
    public JSONResult selectedByUserId(int userId){
        if (!isEmpty(userId)){
            return JSONResult.ok(service.selectedByUserId(userId));
        }else if (isEmpty(userId)){
            return JSONResult.errorMsg("userId参数为空");
        }else{
            return JSONResult.errorMsg("未知错误");
        }
    }

    @ApiOperation(value = "通过infoId获取某用户动态数据",notes = "infoId")
    @RequestMapping(value = "/selectedByInfoId",method = RequestMethod.POST)
    public JSONResult selectedByInfoId(int infoId){
        if (!isEmpty(infoId)){
            return JSONResult.ok(service.selectedByInfoId(infoId));
        }else if (isEmpty(infoId)){
            return JSONResult.errorMsg("infoId 参数为空");
        }else{
            return JSONResult.errorMsg("未知错误");
        }
    }

}