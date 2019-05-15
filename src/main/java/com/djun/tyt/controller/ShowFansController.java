package com.djun.tyt.controller;

import com.djun.tyt.service.ShowFansService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import utils.JSONResult;

import javax.annotation.Resource;

@Api(description ="显示粉丝")
@RestController
@RequestMapping("/User")
public class ShowFansController {
        @Resource
        ShowFansService service;
        /**
         *
         * @param userId  被关注者id
         * @return ok
         */
        @ApiOperation(value = "根据用户userId查询粉丝",notes = "查询用户所有的粉丝")
        @RequestMapping(value = "/showAllFans.do",method = RequestMethod.POST)
        public JSONResult showFans(int userId){
                return JSONResult.ok(service.showFans(userId));
        }


}
