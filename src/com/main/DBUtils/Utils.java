package com.main.DBUtils;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Utils {

    private static String driver;
    private static String url;
    private static String username;
    private static String password;

    static{
        Properties properties = new Properties();
        try {
            Reader reader = new FileReader("src\\resourch\\application.properties");
            properties.load(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
        driver = properties.getProperty("jdbc.driver");
        url = properties.getProperty("jdbc.url");
        username = properties.getProperty("jdbc.username");
        password = properties.getProperty("jdbc.password");
    }

    private static void load() throws ClassNotFoundException {
        Class.forName(driver);
    }

    public static Connection getConn() throws SQLException, ClassNotFoundException {
        load();
        return DriverManager.getConnection(url, username, password);
    }

}
