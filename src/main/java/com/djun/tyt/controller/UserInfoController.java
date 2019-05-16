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

@Api(description = "个人用户信息")
@RestController
@RequestMapping("/User")
public class UserInfoController {
    @Resource
    UserInfoService service;

    /**
     * queryAll
     * @return ok
     */
    @ApiOperation(value ="查询所有用户信息",notes ="查询所有用户的所有信息")
    @RequestMapping(value = "/queryAll",method = RequestMethod.GET)
    public JSONResult queryAll(){
        return JSONResult.ok(service.queryAll());
    }
    /**
     *  update
     * @param model 个人用户信息数据
     * @return ok
     */
    @ApiOperation(value = "修改用户信息",notes = "修改、删除、插入都用这一接口，前台采用表单方式提交用户所有显示的数据，每一次提交内容里面必须要有userId")
    @RequestMapping(value = "/update.do",method = RequestMethod.POST)
    public JSONResult update(UserInfo model){
        model.setUserUpdateTime(new Date());
        service.update(model);
        return JSONResult.ok("修改成功");
    }
}
