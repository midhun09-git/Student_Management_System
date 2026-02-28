package sms;

import java.util.function.Function;

public non-sealed class Teacher extends Person implements Payable {
    private Department department;
    private double salary;

    public Teacher(String name, int age, String id, Department department, double salary) {
        super(name, age, id);
        this.department = department;
        this.salary = salary;
    }

    public Department getDepartment() { 
    	return department; 
    	}
    
    public void setDepartment(Department department) { 
    	this.department = department; 
    	}

    public double getSalary() { 
    	return salary; 
    	}
    
    public void setSalary(double salary) { 
    	this.salary = salary; 
    	}
   
    
        @Override
    public void displayInfo() {

    	Function<Double, Double> addBonus = s -> s + (s * 0.10);
        double bonus = addBonus.apply(salary);
        
        System.out.println("\n=== Teacher Profile ===");
        System.out.println("Name       : " + getName());
        System.out.println("Age        : " + getAge());
        System.out.println("Teacher ID : " + getId());
        System.out.println("Department : " + department);
        System.out.printf("Base Salary : $%.2f%n", salary);
        System.out.printf("Salary with 10%% Bonus: $%.2f%n", bonus);
        greet();  // personalized greeting
        System.out.println("============================\n");
    }

		@Override
		public double calculatePay() {
			// TODO Auto-generated method stub
			return 0;
		}
}
