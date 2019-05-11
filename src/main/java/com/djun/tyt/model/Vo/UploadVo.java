package com.djun.tyt.model.Vo;

import io.swagger.annotations.ApiModel;

@ApiModel(description = "返回处理后上传文件的数据")
public class UploadVo {
    //上传结果
    private String result;
    //后端获得文件名
    private String beginFileName;
    //最终上传文件名
    private String lastFileName;
    //文件类型
    private String FileType;
    //文件大小
    private String fileSize;
    //文件上传的地址
    private String uploadUrl;

    public UploadVo() {
    }

    public UploadVo(String result, String beginFileName, String lastFileName, String fileType, String fileSize, String uploadUrl) {
        this.result = result;
        this.beginFileName = beginFileName;
        this.lastFileName = lastFileName;
        FileType = fileType;
        this.fileSize = fileSize;
        this.uploadUrl = uploadUrl;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getBeginFileName() {
        return beginFileName;
    }

    public void setBeginFileName(String beginFileName) {
        this.beginFileName = beginFileName;
    }

    public String getLastFileName() {
        return lastFileName;
    }

    public void setLastFileName(String lastFileName) {
        this.lastFileName = lastFileName;
    }

    public String getFileType() {
        return FileType;
    }

    public void setFileType(String fileType) {
        FileType = fileType;
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public String getUploadUrl() {
        return uploadUrl;
    }

    public void setUploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
    }

    @Override
    public String toString() {
        return "UploadVo{" +
                "result='" + result + '\'' +
                ", beginFileName='" + beginFileName + '\'' +
                ", lastFileName='" + lastFileName + '\'' +
                ", FileType='" + FileType + '\'' +
                ", fileSize='" + fileSize + '\'' +
                ", uploadUrl='" + uploadUrl + '\'' +
                '}';
    }
}