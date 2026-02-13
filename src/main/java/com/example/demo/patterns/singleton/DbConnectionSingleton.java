package com.example.demo.patterns.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnectionSingleton {

    private static DbConnectionSingleton instance;
    private Connection connection;

    private static final String URL = "jdbc:postgresql://localhost:5432/lostfound";
    private static final String USER = "postgres";
    private static final String PASSWORD = "Petyatomiris07";

    private DbConnectionSingleton() {
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException("DB connection failed", e);
        }
    }

    public static DbConnectionSingleton getInstance() {
        if (instance == null) {
            instance = new DbConnectionSingleton();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}
