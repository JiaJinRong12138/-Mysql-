package com.main.use_Path;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class DisplyByPath {
    /*用于将图片存到另一个文件夹*/
    public static Boolean save_img(String path) throws IOException {

        System.out.println(path);
        FileInputStream inputStream = new FileInputStream(path);

        FileOutputStream fileOutputStream = new FileOutputStream(
                "src\\resourch\\img_copy\\img"+String.valueOf((int)(Math.random()*1000000000))+".jpg");

//        读取写入信息
        int len = 0;
//        创建直接数组，当作缓冲区
        byte[] bytes = new byte[1024];
        while ((len = inputStream.read(bytes)) != -1){
            fileOutputStream.write(bytes);
        }

//        关闭流
//        先看后关，后开先关
        fileOutputStream.close();
        inputStream.close();


        return false;
    }
}
