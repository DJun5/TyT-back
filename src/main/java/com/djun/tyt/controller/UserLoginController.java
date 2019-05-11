package com.djun.tyt.controller;

import com.djun.tyt.service.UserLoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import utils.JSONResult;
import utils.ValidatorUtil;

import javax.annotation.Resource;

import static org.springframework.util.ObjectUtils.isEmpty;

@Api(description = "用户登录")
@RestController
@RequestMapping("/User")
public class UserLoginController {
    @Resource
    private UserLoginService service;

    /**
     * 用户的三种登录方式
     * @param uName 账号（电话号码、学号、AI账号）
     * @param password 密码，前端上传密文
     * @return true or false
     */
    @ApiOperation(value = "账号密码登录" ,  notes="uName password")
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public JSONResult login(String uName, String password){
        if (isEmpty(password)){
            return JSONResult.errorMsg("password参数为空");
        }else if(isEmpty(uName)){
            return JSONResult.errorMsg("uName参数为空");
        }else {
            if (!ValidatorUtil.isMobile(uName)){
                return JSONResult.ok(service.login(uName, password));
            }else if (ValidatorUtil.isMobile(uName)){
                return JSONResult.ok(service.login2(uName, password));
            }else{
                return JSONResult.ok(service.login3(uName, password));
            }
        }
    }

}
