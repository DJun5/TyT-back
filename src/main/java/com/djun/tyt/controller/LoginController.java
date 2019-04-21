package com.djun.tyt.controller;

import com.djun.tyt.service.LoginService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import utils.EncryptUtil;
import utils.JSONResult;
import utils.ValidatorUtil;

import javax.annotation.Resource;

import java.util.Date;

import static org.springframework.util.StringUtils.isEmpty;

@Api(description = "登录验证")
@RestController
public class LoginController {
    @Resource
    private LoginService service;

    /**
     * 登录验证
     *
     * @param uname     用户名或者电话号码
     * @param upassword 密码
     * @return ok
     */
    @RequestMapping(value = {"/Login"}, method = RequestMethod.POST)
    public JSONResult confirmAccount(String uname, String upassword) {
        TUser model = new TUser();
        ULogin uLogin = new ULogin();
        EncryptUtil encrypt = new EncryptUtil();

        if (isEmpty(uname) && isEmpty(upassword)) {
            return JSONResult.errorMsg("当前用户名与密码为空，请检查参数");
        } else {
            model.setUpassword(encrypt.DESdecode(upassword,"tyt"));
            Boolean isMobile = ValidatorUtil.isMobile(uname);
            if ( isMobile = true)
                return JSONResult.ok(service.confirmByMobile(model));
            else
                //service.addSubmit(uLogin);
                //service.update(uLogin);
                uLogin.setLogintime(new Date());
            return JSONResult.ok(service.confirmByUsername(model));

        }
    }
}
