package com.example.servletssample3;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLiteExample {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:exchangeDB.sqlite";

        try {
            Connection connection = DriverManager.getConnection(url);

        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
