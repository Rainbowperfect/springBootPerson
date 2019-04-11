package org.person.project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConnectionOracle {

    private static Logger logger=LoggerFactory.getLogger(ConnectionOracle.class);
    private static Connection connection=null;

    static {

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url="thin:@172.0.0.1:1521:orcl";
            String username="C##comtop";
            String password="comtop";
            connection = DriverManager.getConnection(url, username, password);
            String sql="select S.* from S where SD='生物制药'";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("学生ID:"+rs.getString("s#")+"学生名字:"+rs.getString("SN")+"学生课程:"+rs.getString("SD")
                        +"学生分数:"+rs.getString("SN"));
            }
            ps.close();
            connection.close();
        } catch (Exception e) {
            logger.error("查询失败");
        }
    }
}
