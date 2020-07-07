package JDBC;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class TransactionDemo {
    public static void main(String[] args) throws SQLException {
        bank();

    }

    public static void bank() throws SQLException {
        String sql1 = "update account set balance = balance - ? where id = ?";
        String sql2 = "update account set balance = balance + ? where id = ?";
        Connection conn = null;
        PreparedStatement pstmt1 = null;
        PreparedStatement pstmt2 = null;

        try{
            conn = getConnectionByProperties();
            pstmt1 = conn.prepareStatement(sql1);
            pstmt2 = conn.prepareStatement(sql2);
            conn.setAutoCommit(false);

            pstmt1.setDouble(1,100);
            pstmt1.setInt(2,1);

            pstmt2.setDouble(1,100);
            pstmt2.setInt(2,2);

            int c = pstmt1.executeUpdate();
            pstmt2.executeUpdate();
            System.out.println(c);

            conn.commit();
        } catch (Exception e){
            conn.rollback();
            e.printStackTrace();
        } finally {
            close(null, pstmt1, conn);
            close(null, pstmt2, null);
        }
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

    public static Connection getConnectionByProperties(){
        try {
            Class<Main> cls = Main.class;
            Properties pro = new Properties();
            InputStream is = cls.getClassLoader().getResourceAsStream("JDBC/jdbc.properties");
            pro.load(is);

            String driver = pro.getProperty("driver");
            String url = pro.getProperty("url");
            System.out.println(url);
            String username = pro.getProperty("username");
            String password = pro.getProperty("password");

            Class.forName(driver);
            return DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
