package com.udemy.sdet;

import com.udemy.sdet.pojo.CustomerInfo;

import java.sql.*;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/UdemySDET", "root", "*aP!J*#3NFz3");

        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM CustomerInfo WHERE location = 'Asia' and PurchasedDate = CURRENT_DATE();");
        while (resultSet.next()) {
            CustomerInfo customerInfo = new CustomerInfo();
            customerInfo.setAmount(resultSet.getInt("amount"));
            customerInfo.setCourserName(resultSet.getString("courseName"));
            customerInfo.setLocation(resultSet.getString("location"));
            customerInfo.setPurchaseDate(resultSet.getDate("purchasedDate"));
        }

        conn.close();
    }
}
