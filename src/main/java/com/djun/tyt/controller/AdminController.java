package com.djun.tyt.controller;

import com.djun.tyt.model.Admin;
import com.djun.tyt.service.AdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import utils.EncryptUtil;
import utils.JSONResult;

import javax.annotation.Resource;

import static org.springframework.util.ObjectUtils.isEmpty;
import static utils.Constant.PWD_KEY;

@Api(description = "管理员")
@RestController
@RequestMapping("/Admin")
public class AdminController {
    @Resource
    private AdminService service;
    private EncryptUtil encrypt = new EncryptUtil();
    private Admin adminModel = new Admin();
    /**
     * 新增管理员数据
     * @param model 管理员数据
     *              name    管理员账号
     *              pwd     密码
     *              roleId  权限id
     * @return ok
     */
    @ApiOperation(value = "新增管理员数据" ,  notes="POST传参：name pwd roleId")

    @RequestMapping(value = {"/addSubmit"},method = RequestMethod.POST)
    public JSONResult addSubmit(Admin model){
        // 加密管理员密码存库
        if (!isEmpty(model.getPwd()))
            model.setPwd(encrypt.DESencode(model.getPwd(),PWD_KEY));
        else
            return JSONResult.errorMsg("检查pwd参数");
        service.addSubmit(model);
        return JSONResult.ok("插入成功");
    }

    /**
     * 修改管理员密码
     * @param id 管理员id
     * @param newPwd 新密码
     * @return ok
     */
    @ApiOperation(value = "修改密码" ,  notes="POST传参：pwd")
    @RequestMapping(value = {"/update"},method = RequestMethod.POST)
    public JSONResult update(int id,String newPwd){
        if (!isEmpty(id) && !isEmpty(newPwd)){
            adminModel.setPwd(encrypt.DESencode(adminModel.getPwd(),PWD_KEY));
            service.update(id,newPwd);
        }
        else
            return JSONResult.errorMsg("请检查参数id和newPwd");
        return JSONResult.ok("插入成功");
    }

    @ApiOperation(value = "查询管理员数据" ,  notes="GET")
    @RequestMapping(value = {"/queryAll"},method = RequestMethod.GET)
    public JSONResult queryAll(){
        return JSONResult.ok(service.queryAll());
    }

    @ApiOperation(value = "删除管理员" ,  notes="POST：admin的id")
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public JSONResult delete(Integer id){
        service.delete(id);
        return JSONResult.ok("删除成功");
    }

}
