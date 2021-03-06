package com.djun.tyt.controller;

import com.djun.tyt.model.DynamicInfo;
import com.djun.tyt.model.Pojo.UInfoImg;
import com.djun.tyt.model.Vo.UploadVo;
import com.djun.tyt.service.DynamicInfoService;
import com.djun.tyt.service.UploadService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static org.springframework.util.ObjectUtils.isEmpty;

@Api(description = "用户动态数据")
@RestController
@RequestMapping("/Dynamic")
public class DynamicInfoController {
    @Resource
    private DynamicInfoService service;
    @Resource
    private UploadService uploadService;


    @ApiOperation(value = "获取全部动态数据",notes = "全部用户的全部动态")
    @RequestMapping(value = "/queryAll.do",method = RequestMethod.GET)
    public JSONResult queryAll(){
        return JSONResult.ok(service.queryAll());
    }

    @ApiOperation(value = "通过userId获取某用户动态数据",notes = "userId")
    @RequestMapping(value = "/selectedByUserId.do",method = RequestMethod.POST)
    public JSONResult selectedByUserId(int userId){
        if (!isEmpty(userId)){
            return JSONResult.ok(service.selectedByUserId(userId));
        }else if (isEmpty(userId)){
            return JSONResult.errorMsg("userId参数为空");
        }else{
            return JSONResult.errorMsg("未知错误");
        }
    }

    /**
     * @param model  动态信息
     * @return
     */
    @ApiOperation(value = "用户发布的一条动态",notes ="前台需要传userId、title、content、dynamicOpenDegreeId、dynamicType到后台，图片是上传到服务器")
    @RequestMapping(value = "/addSubmit.do",method = RequestMethod.POST)
    public JSONResult AddDynamic(@RequestParam("file") MultipartFile []file,DynamicInfo model){
        model.setDynamicCreateTime(new Date());
        if (file == null) {
            return JSONResult.errorMsg("检查图片参数是否为file");
        }else {
            UploadVo uploadVo=new UploadVo();
            int flag=0;
            try {
                for(MultipartFile o:file){
                    uploadVo = FuncUtils.upload(o,uploadService, Constant.UPLOAD_PATH);
                    flag++;
                    switch (flag){
                        case 1:{
                            model.setInfoImg1(uploadVo.getLastFileName());
                            break;
                        }
                        case 2:{
                            model.setInfoImg2(uploadVo.getLastFileName());
                            break;
                        }
                        case 3:{
                            model.setInfoImg3(uploadVo.getLastFileName());
                            break;
                        }
                        case 4:{
                            model.setInfoImg4(uploadVo.getLastFileName());
                            break;
                        }
                        case 5:{
                            model.setInfoImg5(uploadVo.getLastFileName());
                            break;
                        }
                        case 6:{
                            model.setInfoImg6(uploadVo.getLastFileName());
                            break;
                        }
                        case 7:{
                            model.setInfoImg7(uploadVo.getLastFileName());
                            break;
                        }
                        case 8:{
                            model.setInfoImg8(uploadVo.getLastFileName());
                            break;
                        }
                        case 9:{
                            model.setInfoImg9(uploadVo.getLastFileName());
                            break;
                        }
                    }
                }
                service.AddDynamic(model);
                service.passImg();
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
     * @param id  当前登录用户id
     * @return   动态信息
     */
    @ApiOperation(value = "通过当前登录用户id查询所有被关注者id来查询被关注者发布的动态",notes="显示该用户关注他人发布的所有动态")
    @RequestMapping(value = "selectById.do",method = RequestMethod.GET)
    public JSONResult selectById(int id){
        return JSONResult.ok(service.queryDynamic(id));
    }

    /**
     *  id：infoId
     *  fid：类别
     *  oid：公开程度
     *  title：动态主题
     *  content：动态内容
     *
     * @param model 动态信息
     * @return ok
     */
    @ApiOperation(value = "通过infoId修改动态信息",notes = "修改用户发布动态的主题和内容")
    @RequestMapping(value = "/update.do",method = RequestMethod.PUT)
    public JSONResult updateDynamic(DynamicInfo model){
        if(model.getInfoId()!=0) {
            model.setDynamicUpdateTime(new Date());
            service.updateDynamic(model);
            return JSONResult.ok("修改成功");
        }else{
            return JSONResult.ok("infoId参数为空");
        }
    }

    /**
     *
     * @param infoId 动态表主键
     * @return ok
     */
    @ApiOperation(value = "通过infoId删除动态信息",notes="删除用户指定的一条动态,删除动态时必须先删除u_info_img里面的要删除动态的图片")
    @RequestMapping(value ="/delete.do",method = RequestMethod.DELETE)
    public JSONResult deleteDynamic(int infoId){
        service.deleteDynamic(infoId);
        return JSONResult.ok("删除成功");
    }
}
