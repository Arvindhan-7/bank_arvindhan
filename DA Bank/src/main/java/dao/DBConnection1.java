package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection1 {
    private static final String URL = "jdbc:mysql://localhost:3306/BankAdminDB";
    private static final String USER = "root";
    private static final String PASSWORD = "Godisgood@24/7";

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}

