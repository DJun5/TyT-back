package com.djun.tyt.service;

import com.djun.tyt.model.Vo.UploadVo;
import org.springframework.web.multipart.MultipartFile;

public interface UploadService {
    UploadVo upload(MultipartFile file, String uploadFilePath) throws Exception;
}
