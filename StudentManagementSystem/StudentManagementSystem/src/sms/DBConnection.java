package sms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    // Updated database name
    private static final String URL = "jdbc:mysql://localhost:3306/schoolman_system";
    private static final String USER = "root"; // your DB username
    private static final String PASSWORD = "rusev1234"; // your DB password

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
