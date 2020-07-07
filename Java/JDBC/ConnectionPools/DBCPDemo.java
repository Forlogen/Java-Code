//package JDBC.ConnectionPools;
//
//import org.apache.commons.dbcp2.BasicDataSource;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.Scanner;
//
//public class DBCPDemo {
//    public static void main(String[] args) {
//        boolean b = UsingDBCPGetConnection("Forlgoen", "100");
//        String message = b == true ? "welcome..." : "please input correct username and password!";
//        System.out.println(message);
//
//    }
//
//    private static boolean UsingDBCPGetConnection(String username, String password) {
//        // 创建连接池对象
//        BasicDataSource dataSource = new BasicDataSource();
//        // 设置参数
//        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://localhost:3306/sql_store" +
//                "?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=GMT&allowPublicKeyRetrieval=true");
//        dataSource.setUsername("root");
//        dataSource.setPassword("120809");
//
//        Connection conn = null;
//        PreparedStatement pstmt = null;
//        ResultSet res = null;
//        String sql = "SELECT * FROM account WHERE username = ? AND password = ?";
//
//        try{
//            // 获取连接对象
//            conn = dataSource.getConnection();
//            pstmt = conn.prepareStatement(sql);
//            pstmt.setString(1, username);
//            pstmt.setString(2, password);
//            res = pstmt.executeQuery();
//            return res.next();
//        } catch (Exception e){
//            e.printStackTrace();
//        } finally {
//            close(res, pstmt, conn);
//        }
//        return false;
//    }
//
//    public static void close(ResultSet resultSet, PreparedStatement pst, Connection connection) {
//        if (resultSet != null) {
//            try {
//                resultSet.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//        if (pst != null) {
//            try {
//                pst.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//        if (connection != null) {
//            try {
//                connection.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
