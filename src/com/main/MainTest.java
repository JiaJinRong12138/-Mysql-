package com.main;

import com.main.use_Mysql.DisplayByMysql;
import com.main.use_Mysql.Use_Mysql;
import com.main.use_Path.DisplyByPath;
import com.main.use_Path.Use_Path;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class MainTest {

    public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
        /*mysql存放头像*/

        /*使用存放路径的方式*/
        /*Use_Path use_path = new Use_Path();
//        System.out.println(use_path.addPic("timg0.jpg"));

        while(true) {
            DisplyByPath.save_img(use_path.finPic(2).toString());
        }*/

        /*存放二进制文件*/
        Use_Mysql use_mysql = new Use_Mysql();
//        System.out.println(use_mysql.addPic(new FileInputStream("src\\resourch\\img\\timg0.jpg")));
        DisplayByMysql.save_img((byte[]) use_mysql.finPic(1));


    }

}
