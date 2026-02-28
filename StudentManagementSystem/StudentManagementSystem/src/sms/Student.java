package sms;

public final class Student extends Person {
    private GradeLevel gradeLevel;
    private double gpa;

    public Student(String name, int age, String id, GradeLevel gradeLevel, double gpa) {
    	
        super(name, age, id);
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
    }

    public GradeLevel getGradeLevel() { 
    	return gradeLevel; 
    	}
    
    public void setGradeLevel(GradeLevel gradeLevel) {
    	this.gradeLevel = gradeLevel; 
    	}

    public double getGpa() { 
    	return gpa; 
    	}
    
    public void setGpa(double gpa) { 
    	this.gpa = gpa; 
    	}

    @Override
    public void displayInfo() {
        System.out.println("\n=== Student Profile ===");
        System.out.println("Name       : " + getName());
        System.out.println("Age        : " + getAge());
        System.out.println("Student ID : " + getId());
        System.out.println("Grade      : " + gradeLevel);
        System.out.printf("GPA        : %.2f%n", gpa);  // formatted to 2 decimal places
        greet();  // personalized greeting
        System.out.println("============================\n");
     
    }
}
