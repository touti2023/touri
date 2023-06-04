package Day0604;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class JDBCDemo {
    public static void main(String[] args) throws Exception {
        //1.注册驱动
        Class.forName("com.mysql.jdbc.Driver");

        //2.获取连接
        String url = "jdbc:mysql://localhost:3306/hspqs";
        String username = "root";
        String password = "12345678";

        Connection conn = DriverManager.getConnection(url,username,password);

        //3.定义sql

        //4.执行获取sql的对象Statement
        Statement stmt  = conn.createStatement();
        String sql = "";
        ResultSet rs = stmt.executeQuery(sql);


        //5.执行sql
        while(rs.next()){

        }
        //6.处理结果

        //7.释放资源
        stmt.close();
        conn.close();
    }
}

