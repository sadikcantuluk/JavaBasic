package JDBC;

import java.sql.*;
import java.util.ArrayList;

public class InsertMain {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            connection = dbHelper.getConnection();
            String sqlCommand = "Insert into Categories (CategoryName,Description) values (?,?)";
            statement = connection.prepareStatement(sqlCommand);
            statement.setString(1,"Gıda");
            statement.setString(2,"Tekstil");
            int resultEffectiveRowCounter = statement.executeUpdate();
            System.out.println("Başarıyla eklendi."+resultEffectiveRowCounter+" satır etkilendi.");
        } catch (SQLException exception) {
            dbHelper.ShowErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
    }
}
