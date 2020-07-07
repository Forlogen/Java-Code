//package JDBC.ConnectionPools;
//
//import com.mchange.v2.c3p0.ComboPooledDataSource;
//
//import javax.sql.DataSource;
//import java.beans.PropertyVetoException;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//
//public class C3P0 {
//    public static void main(String[] args) throws Exception {
//
//        DataSource ds = new ComboPooledDataSource();
//        Connection con = ds.getConnection();
//        System.out.println("con:"+con);
//
////        Connection conn = getConnection();
////        System.out.println(conn);
//
////        UsingC3P0GetConnection();
//    }
//
//    // ”≤–¥»Î
//    private static void UsingC3P0GetConnection() throws Exception {
//        ComboPooledDataSource dataSource = new ComboPooledDataSource();
//        dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
//        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/sql_store" +
//                "?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=GMT&allowPublicKeyRetrieval=true");
//        dataSource.setUser("root");
//        dataSource.setPassword("120809");
//        final Connection connection = dataSource.getConnection();
//        System.out.println(connection);
//    }
//
//
//    public static Connection getConnection(){
//        ComboPooledDataSource cpds = new ComboPooledDataSource();
//        try {
//            return cpds.getConnection();
//        } catch (SQLException e) {
//            e.printStackTrace();
//            System.out.println("¡¨Ω” ß∞‹");
//            return null;
//        }
//    }
//
//    public static void close(Connection conn){
//        if(conn!=null){
//            try {
//                conn.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
