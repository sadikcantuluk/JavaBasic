package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateMain {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            connection = dbHelper.getConnection();
            String sqlCommand = "Delete from Categories where CategoryID = ?";
            statement = connection.prepareStatement(sqlCommand);
            statement.setInt(1,9);
            int resultEffectiveRowCounter = statement.executeUpdate();
            System.out.println("Başarıyla silindi."+resultEffectiveRowCounter+" satır etkilendi.");
        } catch (SQLException exception) {
            dbHelper.ShowErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
    }
}
