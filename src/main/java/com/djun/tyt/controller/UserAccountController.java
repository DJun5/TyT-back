package com.djun.tyt.controller;

import com.djun.tyt.model.TUser;
import com.djun.tyt.service.UserAccountService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import utils.JSONResult;

import javax.annotation.Resource;

@Api(description = "用户信息")
@RestController
@RequestMapping("/UserAccount")
public class UserAccountController {
    @Resource
    private UserAccountService service;

    @ApiOperation(value = "新增用户数据" ,  notes="POST方法传入非必选参数参数：uname\nupassword\nphone\nemail\nuimg")
    @RequestMapping(value = {"/addSubmit"},method = RequestMethod.POST)
    public JSONResult addSubmit(TUser model){
        service.addSubmit(model);
        return JSONResult.ok("添加成功");
    }

    @ApiOperation(value = "查询用户数据" ,  notes="GET方法")
    @RequestMapping(value = {"/queryAll"},method = RequestMethod.GET)
    public JSONResult queryAll(){
        return JSONResult.ok(service.queryAll());
    }

    @ApiOperation(value = "查询用户数据" ,  notes="POST方法")
    @RequestMapping(value = {"/queryAll"},method = RequestMethod.POST)
    public JSONResult update(TUser model){
        service.update(model);
        return JSONResult.ok("修改成功");
    }

}
