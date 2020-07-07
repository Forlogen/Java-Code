package JDBC;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@jdbc(driver = "com.mysql.cj.jdbc.Driver",
        url = "jdbc:mysql://localhost:3306/sql_store" +
                "?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone = GMT&allowPublicKeyRetrieval=true",
        username = "root", password = "120809")
public class Main {
    public static void main(String[] args){
//        executeSQL();
//        executeInsert();
//        executeUpdate();
//        executeDelete();
//        executeSelect();
        ArrayList<Products> all = findAll();
        for (Products products : all) {
            System.out.println(products);
        }
    }

    private static ArrayList<Products> findAll() {
        String sql = "SELECT * FROM products";
        List<Products> list = new ArrayList<>();
        try (Connection connection = getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()){
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                int quantity_in_stock = resultSet.getInt(3);
                int unit_price = resultSet.getInt(4);
                list.add(new Products(id, name, quantity_in_stock, unit_price));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return (ArrayList<Products>) list;
    }

    private static void executeSelect() {
        String sql = "SELECT * FROM customers";

        try (Connection connection = getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()){
                int id = resultSet.getInt(1);
                String first_name = resultSet.getString(2);
                String last_name = resultSet.getString("last_name");
                System.out.println(id + " -- " + first_name + " -- " + last_name);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    private static void executeSQL(){
        Connection connection = null;
        Statement statement = null;
        try {
            connection = getConnection();
            System.out.println(connection);
            // 定义SQL语句
            String sql = "SELECT * FROM customers WHERE customer_id = 1";

            // 获取执行SQL的Statement对象
            statement = connection.createStatement();

            // 执行SQL语句，获取结果
            ResultSet resultSet = statement.executeQuery(sql);
            System.out.println(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (statement != null){
                try {
                    statement.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (connection != null){
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }

    private static void executeInsert(){
        String sql = "INSERT INTO customers (first_name, last_name, birth_date, phone, address, city, state, points) " +
                "VALUES ('Forlogen', 'Liang', '1990-08-24', 888-888-2424, 'Lakers', 'LA', 'C', 81)";

        try (Connection connection = getConnection();
             Statement statement = connection.createStatement()) {
            int count = statement.executeUpdate(sql);
            System.out.println(count);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void executeUpdate(){
        String sql = "UPDATE customers SET phone = '888-888-8888' WHERE first_name = 'Forlogen'";

        try (Connection connection = getConnection();
             Statement statement = connection.createStatement()) {
            int count = statement.executeUpdate(sql);
            System.out.println(count);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void executeDelete(){
        String sql = "DELETE FROM customers WHERE first_name = 'Forlogen'";

        try (Connection connection = getConnection();
             Statement statement = connection.createStatement()) {
            int count = statement.executeUpdate(sql);
            System.out.println(count);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){
        try {
            Class<Main> cls = Main.class;
            jdbc annotation = cls.getAnnotation(jdbc.class);
            String driver = annotation.driver();
            String url = annotation.url();
            String username = annotation.username();
            String password = annotation.password();

            Class.forName(driver);
            return DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

