package com.djun.tyt.controller;

import com.djun.tyt.model.Pojo.UFans;
import com.djun.tyt.service.FollowersService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import utils.JSONResult;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

import static org.springframework.util.ObjectUtils.isEmpty;


@Api(description = "用户关注者")
@RestController
@RequestMapping("/Followers")
public class FollowersController {
    @Resource
    FollowersService service;

    /**
     * 当前登录用户通过id查询自己所关注的用户
     * @param userId  用户（粉丝）userId
     * @return ok
     */
    @ApiOperation(value = "用户通过userId查询关注者",notes = "查询该用户所有的关注者")
    @RequestMapping(value = "/selectByUserId.do",method= RequestMethod.POST)
    public JSONResult showFollowers(int userId){
        if(userId!=0)
            return JSONResult.ok(service.showFollowers(userId));
        else{
            return JSONResult.errorMsg("userId参数为空");
        }
    }

    /**
     * @param model 新增关注记录
     * @return ok
     */
    @ApiOperation(value = "当前登录用户通过userId关注别人",notes="新增粉丝必须将当前登录者fan_id，被关注者uid传入后台")
    @RequestMapping(value = "/addSubmit.do",method = RequestMethod.POST)
    public JSONResult addFollower(UFans model){
        List<UFans> list=service.selectFollwers(model);
        if(model.getFanId()!=0&model.getUid()!=0){
            if(list.isEmpty()){
                model.setCreateTime(new Date());
                service.addFollowers(model);
                return JSONResult.ok("关注成功");
            }else{
                model.setUpdateTime(new Date());
                service.updateFollower(model);
                return JSONResult.ok("关注成功");
            }
        }else {
            return JSONResult.errorMsg("fanId或uid为空");
        }
    }
    @ApiOperation(value = "当前登录用户通过userId取消对别人的关注",notes="修改粉丝必须将当前登录者fan_id，被关注者uid传入后台")
    @RequestMapping(value = "/update.do",method = RequestMethod.PUT)
    public JSONResult updateStatus(UFans model){
        if(model.getFanId()!=0&model.getUid()!=0){
            model.setUpdateTime(new Date());
            service.cancelFollower(model);
            return JSONResult.ok("取消关注成功");
        }else {
            return JSONResult.errorMsg("fanId或uid为空");
        }
    }
}
