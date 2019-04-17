package com.djun.tyt.servicelmp;


import com.djun.tyt.model.Vo.UploadVo;
import com.djun.tyt.service.UploadService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.UUID;

@Service
public class UploadServiceImpl implements UploadService {
    /**
     *
     * @param file 上传的文件
     * @param uploadFilePath 文件上传路径
     * @return //上传结果 result
     *          //后端获得文件名 beginFileName
     *          //最终上传文件名 lastFileName
     *          //文件类型 FileType
     *          //文件大小 fileSize
     *          //文件上传的地址 uploadUrl
     */
    @Override
    public UploadVo upload(MultipartFile file, String uploadFilePath) throws Exception {
        UploadVo uploadVo = new UploadVo();
        if (!file.isEmpty()) {
            String originalFilename;
            String fileName;

            originalFilename = file.getOriginalFilename();
            fileName = UUID.randomUUID().toString() + file.getOriginalFilename();
            String fileType = fileName.substring(fileName.lastIndexOf(".")+1);
            long fileSize = file.getSize();
            File packageFile = new File(uploadFilePath);
            if (!packageFile.exists()) {
                packageFile.mkdir();
            }
            File targetFile = new File(uploadFilePath + "/" + fileName);
            file.transferTo(targetFile);

            uploadVo.setBeginFileName(originalFilename);
            uploadVo.setLastFileName(fileName);
            uploadVo.setFileType(fileType);

            uploadVo.setFileSize(Long.toString(fileSize));
            uploadVo.setUploadUrl(targetFile.toString());
            uploadVo.setResult("上传成功");
            return uploadVo;
        } else {
            return uploadVo;
        }
    }


}
