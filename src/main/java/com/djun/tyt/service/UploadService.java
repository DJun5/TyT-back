package com.djun.tyt.service;

import com.djun.tyt.model.Pojo.UInfoImg;
import com.djun.tyt.model.Vo.UploadVo;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface UploadService {
    UploadVo upload(MultipartFile file, String uploadFilePath) throws Exception;
    void UploadImg(UInfoImg model);
}
