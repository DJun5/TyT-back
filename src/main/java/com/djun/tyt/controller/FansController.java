package com.djun.tyt.controller;

import com.djun.tyt.service.FansService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import utils.JSONResult;

import javax.annotation.Resource;

import static org.springframework.util.ObjectUtils.isEmpty;

@Api(description ="粉丝")
@RestController
@RequestMapping("/Fans")
public class FansController {
        @Resource
        FansService service;
        /**
         * @param userId  被关注者id
         * @return ok
         */
        @ApiOperation(value = "根据用户userId查询粉丝",notes = "查询用户所有的粉丝")
        @RequestMapping(value = "/showAllFans.do",method = RequestMethod.POST)
        public JSONResult showFans(int userId){
                return JSONResult.ok(service.showFans(userId));
        }

        @ApiOperation(value = "删除用户所有粉丝",notes="管理员根据userId删除该用户所有粉丝")
        @RequestMapping(value = "/delete.do",method = RequestMethod.PUT)
        public JSONResult deleteFans(int uid){
                service.delete(uid);
                return JSONResult.ok("删除所有粉丝成功");
        }

}
