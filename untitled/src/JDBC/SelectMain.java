package JDBC;

import java.sql.*;
import java.util.ArrayList;

public class SelectMain {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = dbHelper.getConnection();
            String sqlCommand = "Select CustomerID,CustomerName,City,Country from customers";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sqlCommand);
            ArrayList<NorthwndSchema> nws = new ArrayList<NorthwndSchema>();
            while (resultSet.next()){
                nws.add(new NorthwndSchema(
                        resultSet.getInt("customerıd")
                        ,resultSet.getString("customername")
                        ,resultSet.getString("city")
                        ,resultSet.getString("country")));
            }
            for (NorthwndSchema item : nws) {
                System.out.println(item);
                System.out.println("---------------------------------------------");
            }
        } catch (SQLException exception) {
            dbHelper.ShowErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
    }

    public static void firstConnection() throws SQLException {
        String userName = "root";
        String password = "1234567";
        String dbUrl = "jdbc:mysql://localhost:3306/northwind";

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(dbUrl, userName, password);
            System.out.println("Bağlantı oluştu.");
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        } finally {
            connection.close();
        }
    }

}



