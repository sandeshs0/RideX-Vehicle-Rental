package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {
    private Connection conn;

    public LoginDAO() {
        conn = dbConnection.dbconnect();
    }

    public boolean validateLogin(String phone, String pass) {
        try {
            String query = "SELECT * FROM AdminDetails WHERE PhoneNumber=? AND pass=?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, phone);
            stmt.setString(2, pass);
            ResultSet resultSet = stmt.executeQuery();
            return resultSet.next();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
