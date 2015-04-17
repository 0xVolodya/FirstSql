package com.colib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Vladimir on 18.04.2015.
 */
public class DBWorker {
    private static final String URl ="jdbc:mysql://localhost:3306/sql1";
    private static final String userName="root";
    private static final String password="root";

    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public DBWorker() {
        try {
            connection = DriverManager.getConnection(URl, userName, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
