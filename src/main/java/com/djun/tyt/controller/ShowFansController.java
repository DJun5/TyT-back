package com.djun.tyt.controller;

import com.djun.tyt.service.ShowFansService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import utils.JSONResult;

import javax.annotation.Resource;

@Api(value = "显示粉丝")
@RestController
public class ShowFansController {
        @Resource
        ShowFansService service;
        /**
         *
         * @param userId
         * @return
         */
        @ApiOperation(value = "根据用户userId查询粉丝",notes = "")
        @RequestMapping(value = "/show",method = RequestMethod.POST)
        public JSONResult showFans(int userId){
                return JSONResult.ok(service.showFans(userId));
        }
}
