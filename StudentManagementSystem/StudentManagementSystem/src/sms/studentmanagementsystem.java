package sms;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class studentmanagementsystem {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = now.format(formatter);
        System.out.println("Current date and time: " + formattedDate);

        try {

     
            StudentDAO studentDAO = new StudentDAO();
            TeacherDAO teacherDAO = new TeacherDAO();


            studentDAO.saveStudent(new Student("Aleah Barker", 1022, "reg1", GradeLevel.FRESH, 3.8));
            studentDAO.saveStudent(new Student("Gia Moss", 1023, "reg2", GradeLevel.JUNIOR, 3.6));
            studentDAO.saveStudent(new Student("Ava Sawyer", 1024, "reg3", GradeLevel.SENIOR, 3.2));
            studentDAO.saveStudent(new Student("Nola Walters", 1025, "reg4", GradeLevel.JUNIOR, 3.5));

            teacherDAO.saveTeacher(new Teacher("Dorian Spencer", 1040, "emp1", Department.SCIENCE, 70000));
            teacherDAO.saveTeacher(new Teacher("Kade Blevins", 1035, "emp2", Department.HISTORY, 70000));
            teacherDAO.saveTeacher(new Teacher("Aila Pollard", 1045, "emp3", Department.ENGLISH, 70000));
            teacherDAO.saveTeacher(new Teacher("Jennifer Palacios", 1050, "emp4", Department.MATH, 70000));

            var studentsFromDB = studentDAO.getAllStudents();
            var teachersFromDB = teacherDAO.getAllTeachers();

    
            Records recordManager = new Records(
                    studentsFromDB.toArray(new Student[0]),
                    teachersFromDB.toArray(new Teacher[0])
            );

            recordManager.displayAllRecords();

        } 
        
        
        catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        } 
        
        finally {
        	System.out.println("All students and teachers saved to DB successfully!");
            System.out.println("\nSchool report generation completed successfully.");
        }
        
    }
       
}
