package sms;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TeacherDAO {

    // Save a teacher to the database
    public void saveTeacher(Teacher t) {
        String sql = "INSERT INTO teachers (id, name, age, department, salary) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, t.getId());
            stmt.setString(2, t.getName());
            stmt.setInt(3, t.getAge());
            stmt.setString(4, t.getDepartment().name());
            stmt.setDouble(5, t.getSalary());

            stmt.executeUpdate(); // ✅ This line was missing before

            

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Fetch all teachers from the database
    public List<Teacher> getAllTeachers() {
        List<Teacher> list = new ArrayList<>();
        String sql = "SELECT * FROM teachers";

        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Teacher t = new Teacher(
                    rs.getString("name"),
                    rs.getInt("age"),
                    rs.getString("id"),
                    Department.valueOf(rs.getString("department")),
                    rs.getDouble("salary")
                );
                list.add(t);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    // Delete a teacher by ID
    public void deleteTeacher(String id) {
        String sql = "DELETE FROM teachers WHERE id = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, id);
            int rowsDeleted = stmt.executeUpdate();

            if (rowsDeleted > 0) {
                System.out.println("Teacher record successfully removed from the system.");
            } else {
                System.out.println("No teacher found with ID: " + id);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Update a teacher's salary by ID
    public void updateTeacherSalary(String id, double newSalary) {
        String sql = "UPDATE teachers SET salary = ? WHERE id = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setDouble(1, newSalary);
            stmt.setString(2, id);

            int rowsUpdated = stmt.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("Teacher salary updated successfully in the system.");
            } else {
                System.out.println("No teacher found with ID: " + id);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
