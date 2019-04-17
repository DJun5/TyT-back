package com.djun.tyt.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import utils.Constant;

@Configuration
public class ImgMappingConfig extends WebMvcConfigurerAdapter {
    //配置本地文件映射到url上
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //重写方法
        //修改tomcat 虚拟映射
        registry.addResourceHandler("/images/**").
                addResourceLocations("file:"+ Constant.imgUploadPath+"/");//定义图片存放路径
    }

}
