package utils;

import com.djun.tyt.model.Vo.UploadVo;
import com.djun.tyt.service.UploadService;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.text.SimpleDateFormat;
import java.util.Date;


public class FuncUtils {
    /**
     * 上传文件
     * @param file 上传的文件
     * @param uploadService UploadService的对象
     * @return 文件信息
     */
    public static UploadVo upload(MultipartFile file,UploadService uploadService){
        UploadVo uploadVo = new UploadVo();
        try {
            uploadVo = uploadService.upload(file, Constant.imgUploadPath);
            if(StringUtils.isEmpty(uploadVo.getUploadUrl())){
                JSONResult.ok("上传失败");
            }else
                JSONResult.ok("上传成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return uploadVo;
    }

    public static String  getStringCurrTime(){
        Date currTime = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return df.format(currTime);
    }


//    public static void main(String[] args) {
//        System.out.println(new Date());
//    }
}
