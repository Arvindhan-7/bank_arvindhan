package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/bankadmindb";
    private static final String USER = "root";
    private static final String PASSWORD = "Godisgood@24/7";
    public static  Connection con=null;
    public static  Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(URL,USER,PASSWORD);
            
            return con;
        } catch ( Exception e) {
            e.printStackTrace();
            
        }
        return con;
    }
}

