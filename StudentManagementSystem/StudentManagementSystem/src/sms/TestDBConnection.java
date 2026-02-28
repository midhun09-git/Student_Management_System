package sms;

public class TestDBConnection {
    public static void main(String[] args) {
        var conn = DBConnection.getConnection();

        if (conn != null) {
            System.out.println("Database connection established successfully.");
        } else {
            System.out.println("Database connection failed. Please check the configuration.");
        }
    }
}
