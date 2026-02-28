package sms;

public class Records {
    private Student[] students;
    private Teacher[] teachers;

    
    public Records(Student[] students, Teacher[] teachers) {
        this.students = students;
        this.teachers = teachers;
    }

    public void displayAllRecords() {
        SchoolUtils.printTitle("=== Student Records ===");
        for (Student s : students) {
            s.displayInfo();
        }

        SchoolUtils.printTitle("=== Teacher Records ===");
        for (Teacher t : teachers) {
            t.displayInfo();
        }
    }
}
