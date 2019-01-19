package com.main.use_Mysql;

import java.io.FileOutputStream;
import java.io.IOException;

public class DisplayByMysql {
    /*用于将图片存到另一个文件夹*/
    public static Boolean save_img(byte[] bytes) throws IOException {


        FileOutputStream fileOutputStream = new FileOutputStream(
                "src\\resourch\\img_copy\\img"+(int)(Math.random()*1000000000)+".jpg");
        fileOutputStream.write(bytes);
        return false;
    }
}
