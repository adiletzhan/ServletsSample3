package com.example.servletssample3;


import java.sql.*;

public class DBConnection {

//jdbc:sqlite:identifier.sqlite


    public static void someFun() throws SQLException {

        try {
            Class dbDriver = Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String jdbcURL = "jdbc:sqlite:identifier.sqlite";
        Connection connection = DriverManager.getConnection(jdbcURL);
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select * from employee");

    }
    public static void main(String[] args) {
        //createNewDatabase("test.db");
        try {
            someFun();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

