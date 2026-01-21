package org.example;
import java.sql.*;

public class DatabaseManager {
    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USER = "postgres";
    private static final String PASSWORD = "1234";

    public static Connection connect() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found!");
        }
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void addInstitution(String name, String address, int year) {
        String sql = "INSERT INTO institution(name, address, established_year) VALUES(?, ?, ?)";

        try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, address);
            pstmt.setInt(3, year);

            pstmt.executeUpdate();
            System.out.println("Institution added successfully!");
        } catch (SQLException e) {
            System.out.println("Error teacher: " + e.getMessage());
        }
    }
    public static void addTeacher(String name, String subject) {
        String sql = "INSERT INTO teacher(full_name, subject) VALUES(?, ?)";
        try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, subject);
            pstmt.executeUpdate();
            System.out.println("Teacher added");
        } catch (SQLException e) { System.out.println("Teacher: " + e.getMessage()); }
    }
    public static void addStudent(String fName, String lName, int age, int instId) {
        String sql = "INSERT INTO student(first_name, last_name, age, institution_id) VALUES(?, ?, ?, ?)";
        try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, fName);
            pstmt.setString(2, lName);
            pstmt.setInt(3, age);
            pstmt.setInt(4, instId);
            pstmt.executeUpdate();
            System.out.println("Student added!");
        } catch (SQLException e) { System.out.println("Student: " + e.getMessage()); }
    }
}