package utils;

import com.djun.tyt.model.Vo.UploadVo;
import com.djun.tyt.service.UploadService;
import org.springframework.web.multipart.MultipartFile;

import java.text.SimpleDateFormat;
import java.util.Date;


public class FuncUtils {
    /**
     * 上传文件
     *
     * @param file          上传的文件
     * @param uploadService UploadService的对象
     * @param UPLOAD_PATH   上传路径
     * @return 文件信息
     */
    public static UploadVo upload(MultipartFile file, UploadService uploadService, String UPLOAD_PATH) {
        UploadVo uploadVo = new UploadVo();
        try {
            uploadVo = uploadService.upload(file, UPLOAD_PATH);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return uploadVo;
    }

    /**
     * 获取当前字符串时间
     *
     * @return string时间
     */
    public static String getStringCurrTime() {
        Date currTime = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return df.format(currTime);
    }



}
