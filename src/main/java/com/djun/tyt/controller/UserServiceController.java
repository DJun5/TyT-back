package com.djun.tyt.controller;

import com.djun.tyt.service.UserServiceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import utils.JSONResult;

import javax.annotation.Resource;

import static org.springframework.util.ObjectUtils.isEmpty;

@Api("用户订阅的服务" )
@RestController
@RequestMapping("/User/service" )
public class UserServiceController {
    @Resource
    private UserServiceService service;

    @ApiOperation(value = "",notes="")
    @RequestMapping(value = "/selectByServiceId",method = RequestMethod.POST)
    public JSONResult selectedByServiceId(int serviceId) {
        if (!isEmpty(serviceId)) {
            return JSONResult.ok(service.selectByServiceId(serviceId));
        } else if (isEmpty(serviceId)) {
            return JSONResult.errorMsg("serviceId参数为空");
        } else {
            return JSONResult.errorMsg("未知错误");
        }
    }


}
