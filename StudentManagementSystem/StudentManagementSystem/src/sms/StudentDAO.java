package sms;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    public void saveStudent(Student s) {
        String sql = "INSERT INTO students (id, name, age, grade_level, gpa) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, s.getId());
            stmt.setString(2, s.getName());
            stmt.setInt(3, s.getAge());
            stmt.setString(4, s.getGradeLevel().name());
            stmt.setDouble(5, s.getGpa());

            stmt.executeUpdate();
       

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Student> getAllStudents() {
        List<Student> list = new ArrayList<>();
        String sql = "SELECT * FROM students";

        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Student s = new Student(
                    rs.getString("name"),
                    rs.getInt("age"),
                    rs.getString("id"),
                    GradeLevel.valueOf(rs.getString("grade_level")),
                    rs.getDouble("gpa")
                );
                list.add(s);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
