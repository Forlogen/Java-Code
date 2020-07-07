package JDBC;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class LoginDemo {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input your username...");
        String username = sc.nextLine();
        System.out.println("please input your password...");
        String password = sc.nextLine();
        boolean b = safeLogin(username, password);
        String message = b == true ? "welcome..." : "please input correct username and password!";
        System.out.println(message);
    }

    public static boolean safeLogin(String username, String password) throws SQLException {
        if (username == null || password == null){
            return false;
        }

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet res = null;
        String sql = "SELECT * FROM account WHERE username = ? AND password = ?";

        try{
            conn = getConnectionByProperties();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            res = pstmt.executeQuery();
            return res.next();

        } catch (Exception e){
            e.printStackTrace();
        } finally {
            close(res, pstmt, conn);
        }
        return false;
    }

    public static Connection getConnectionByProperties(){
        try {
            Class<Main> cls = Main.class;
            Properties pro = new Properties();
            InputStream is = cls.getClassLoader().getResourceAsStream("JDBC/jdbc.properties");
            pro.load(is);

            String driver = pro.getProperty("driver");
            String url = pro.getProperty("url");
            String username = pro.getProperty("username");
            String password = pro.getProperty("password");

            Class.forName(driver);
            return DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @jdbc(driver = "com.mysql.cj.jdbc.Driver",
            url = "jdbc:mysql://localhost:3306/sql_test" +
                    "?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone = GMT",
            username = "root", password = "120809")
    public static Connection getConnection(){
        try {
            Class<Main> cls = Main.class;
            jdbc annotation = cls.getAnnotation(jdbc.class);
            String driver = annotation.driver();
            String url = annotation.url();
            System.out.println(url);
            String username = annotation.username();
            String password = annotation.password();

            Class.forName(driver);
            return DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void close(ResultSet resultSet, PreparedStatement pst, Connection connection) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (pst != null) {
            try {
                pst.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
