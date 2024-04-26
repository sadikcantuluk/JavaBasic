package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
    private String userName = "root";
    private String password = "1234567";
    private String dbUrl = "jdbc:mysql://localhost:3306/northwind";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl,userName,password);
    }

    public void ShowErrorMessage(SQLException exception){
        System.out.println("Hata Mesajı :"+exception.getMessage());
        System.out.println("-------------------------------------");
        System.out.println("Hata Kodu :"+exception.getErrorCode());
    }
}
