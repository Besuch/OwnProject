package main;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnector {

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Properties props = new Properties();
        Connection connection = null;
        try (InputStream in =
                     DBConnector.class.getClassLoader().getResourceAsStream("db.properties")) {
            props.load(in);
        } catch (IOException e) {
            System.err.println(e);
        }
        String drivers = props.getProperty("driver");
        if (drivers != null) {
            System.setProperty("driver", drivers);
        }

        String url = props.getProperty("url");
        String user = props.getProperty("user");
        String password = props.getProperty("password");

        try {
            connection =  DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.err.println(e);
        }
        if (connection != null) {
            System.out.println("Connected");
        }
        return connection;
    }
}