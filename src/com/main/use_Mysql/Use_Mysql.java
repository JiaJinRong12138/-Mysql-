package com.main.use_Mysql;

import com.main.DBUtils.Utils;
import com.main.DBUtils.dao.Method_DB;

import java.io.InputStream;
import java.sql.*;

public class Use_Mysql implements Method_DB {

    private Connection connection = Utils.getConn();
    private PreparedStatement preparedStatement;

    public Use_Mysql() throws SQLException, ClassNotFoundException {
    }

    @Override
    public int addPic(Object obj) throws SQLException {
        String sql = "insert into test222(head) values(?)";
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setBlob(1, (InputStream) obj);
        return preparedStatement.executeUpdate();
    }

    @Override
    public Object finPic(int id) throws SQLException {
        String sql = "select head from test222 where id = ?";
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();

        Blob blob = null;
        while (resultSet.next()){
            blob = resultSet.getBlob("head");
        }


        System.out.println((int)(blob.length()));
        byte[] bytes = null;
        if(blob != null){
            /*长度要大于1*/
            long in = 1;
            bytes = blob.getBytes(in, (int)(blob.length()));
        }
        return bytes;
    }
}
