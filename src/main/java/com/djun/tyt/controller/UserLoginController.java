package com.djun.tyt.controller;

import com.djun.tyt.service.UserLoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import utils.Constant;
import utils.EncryptUtil;
import utils.JSONResult;

import javax.annotation.Resource;

import static org.springframework.util.ObjectUtils.isEmpty;

@Api(description = "用户登录")
@RestController
@RequestMapping("/User")
public class UserLoginController {
    @Resource
    private UserLoginService service;
    private EncryptUtil encrypt = new EncryptUtil();
    @ApiOperation(value = "账号密码登录" ,  notes="uName password")
    @RequestMapping(value = "/Login",method = RequestMethod.POST)
    public JSONResult login(String uName, String password){
        if (!isEmpty(password))
            password = encrypt.DESencode(password, Constant.PWD_KEY);

        return JSONResult.ok(service.login(uName,password));
    }

}
