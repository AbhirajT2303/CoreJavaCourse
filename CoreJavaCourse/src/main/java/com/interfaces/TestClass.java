package com.interfaces;

public class TestClass {
    public static void main(String[] args) {
        ConnectingProcess con = new OracleDb();
        System.out.println("For Oracle Database");
        con.connect();
        con.process();
        con.disconnect();
        con = new MySql();
        System.out.println("For Oracle Database");
        con.connect();
        con.process();
        con.disconnect();
    }
}
