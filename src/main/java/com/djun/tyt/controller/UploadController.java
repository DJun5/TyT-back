package com.djun.tyt.controller;


import com.djun.tyt.model.Pojo.UInfoImg;
import com.djun.tyt.model.Vo.UploadVo;
import com.djun.tyt.service.UploadService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import utils.Constant;
import utils.FuncUtils;
import utils.JSONResult;

import javax.annotation.Resource;

@Api(description = "单文件上传接口")
@RestController
public class UploadController {

    @Autowired
    UploadService uploadService;
    /**
     * 此接口仅用于单独上传文件
     * @param file 文件
     * @return UploadVo
     */
    @ApiOperation(value = "文件上传", notes = "上传格式如file:'XXX.jpg'")
    @RequestMapping(value = "/Upload", method = RequestMethod.POST,
            consumes= MediaType.MULTIPART_FORM_DATA_VALUE)
    public JSONResult uploadFile(@RequestParam("file") MultipartFile file) {
        if (file == null) {
            return JSONResult.errorMsg("检查图片参数是否为file");
        }else {
            try {
                UploadVo uploadVo = FuncUtils.upload(file,uploadService, Constant.UPLOAD_PATH);
                if (StringUtils.isEmpty(uploadVo.getUploadUrl())) {
                    return JSONResult.errorMsg("上传失败");
                } else {
                    return JSONResult.ok("上传成功");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return JSONResult.errorMsg("上传失败");
        }
    }

    /**
     *
     * @param model 图片实体类
     * @return ok
     */
    @ApiOperation(value = "图片上传", notes = "上传格式如file:'XXX.jpg'")
    @RequestMapping(value = "/UploadImg.do", method = RequestMethod.POST)
    public JSONResult uploadImg(UInfoImg model) {
        uploadService.UploadImg(model);
        return JSONResult.ok("上传成功");
    }
}
