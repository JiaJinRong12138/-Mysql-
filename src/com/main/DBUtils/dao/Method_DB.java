package com.main.DBUtils.dao;

import java.sql.SQLException;

public interface Method_DB {
    /*添加图片*/
    int addPic(Object obj) throws SQLException;

    /*查询图片*/
    Object finPic(int id) throws SQLException;
}
