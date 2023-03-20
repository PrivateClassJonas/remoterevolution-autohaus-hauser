package com.accenture.remoterevolution.autohaus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Connector {
    public Connection getConnection() throws SQLException {

        Properties connectionProps = new Properties();
        connectionProps.put("user", "root");
        connectionProps.put("password", "secret");
        Connection conn = null;

        conn = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/autohausdb",
                connectionProps);

        System.out.println("Connected to database");
        return conn;
    }
}
