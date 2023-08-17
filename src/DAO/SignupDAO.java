package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SignupDAO {
    private Connection conn;

    public SignupDAO() {
        conn = dbConnection.dbconnect();
    }

    public boolean registerUser(String FName, String LastName, String Phone, String password, String sec_qn, String sec_ans) {
        // Use the provided input parameters to insert data into the database
        String sql = "INSERT INTO AdminDetails (FirstName, LastName, PhoneNumber, pass, security_qn, sec_ans) VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, FName);
            pstmt.setString(2, LastName);
            pstmt.setString(3, Phone);
            pstmt.setString(4, password);
            pstmt.setString(5, sec_qn);
            pstmt.setString(6, sec_ans);

            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean isPhoneRegistered(String phone) {
        try {
            String query = "SELECT COUNT(*) FROM AdminDetails WHERE PhoneNumber = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, phone);
            int count = 0;
            try (var resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    count = resultSet.getInt(1);
                }
            }
            return count > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
