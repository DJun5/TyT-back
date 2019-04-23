package com.djun.tyt.controller;

import com.djun.tyt.model.TUser;
import com.djun.tyt.service.UserAccountService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import utils.Constant;
import utils.EncryptUtil;
import utils.JSONResult;
import javax.annotation.Resource;

@Api(description = "后台操作用户数据")
@RestController
@RequestMapping("/UserAccount")
public class UserAccountController {
    @Resource
    private UserAccountService service;
    private EncryptUtil encrypt = new EncryptUtil();

    @ApiOperation(value = "查询用户数据" ,  notes="GET")
    @RequestMapping(value = {"/queryAll"},method = RequestMethod.GET)
    public JSONResult queryAll(){
        return JSONResult.ok(service.queryAll());
    }

    /**
     * 增加账户
     * @param model 用户基本信息
     *                  uname
     *                  password
     *                  phone
     *                  email
     *                  uimg
     */
    @ApiOperation(value = "新增用户数据" ,  notes="POST传入非必选参数参数：uname\tpassword\tphone\temail\tuimg")
    @RequestMapping(value = {"/addSubmit"},method = RequestMethod.POST)
    public JSONResult addSubmit(TUser model){
        model.setPassword(encrypt.DESencode(model.getPassword(), Constant.PWD_KEY));
        service.addSubmit(model);
        return JSONResult.ok("添加成功");
    }

    /**
     * 修改账户数据
     * @param model upassword
     *                  phone
     *                  email
     *                  uimg
     */
    @ApiOperation(value = "修改用户数据" ,  notes="POST")
    @RequestMapping(value = {"/update"},method = RequestMethod.POST)
    public JSONResult update(TUser model){
        model.setPassword(encrypt.DESencode(model.getPassword(), Constant.PWD_KEY));
        service.update(model);
        return JSONResult.ok("修改成功");
    }

}
