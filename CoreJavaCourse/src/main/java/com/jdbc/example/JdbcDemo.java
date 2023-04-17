package com.jdbc.example;

import java.sql.*;

public class JdbcDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");

            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("select * from details");
            while(rs.next()){
                System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));
            }
            con.close();



        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
