package com.main.use_Path;

import com.main.DBUtils.Utils;
import com.main.DBUtils.dao.Method_DB;

import java.sql.*;

public class Use_Path implements Method_DB {

    /**
     * 通过存放图片的地址来存放头像
     * */

    private Connection conn = Utils.getConn();
    private PreparedStatement preparedStatement;

    public Use_Path() throws SQLException, ClassNotFoundException {
    }

    @Override
    public int addPic(Object obj) throws SQLException {
        /*obj ----> img_path*/
        StringBuffer path = new StringBuffer("src\\resourch\\img\\");
        path.append(obj);
        String sql = "insert into test111(head) values(?)";
        preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(1, path.toString());
        return preparedStatement.executeUpdate();
    }

    @Override
    public Object finPic(int id) throws SQLException {
        /*查找图片*/
        String sql = "select head from test111 where id = ?";
        preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        System.out.println(preparedStatement.toString());
        ResultSet rs = preparedStatement.executeQuery();
        String head = null;
        while(rs.next()) {
             head = rs.getString("head");
        }
        return head;
    }


}
