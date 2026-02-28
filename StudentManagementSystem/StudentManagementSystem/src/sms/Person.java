package sms;

sealed abstract class Person permits Student, Teacher {
    private String name;
    private int age;
    private String id;

    public Person(String name, int age, String id) {
    	
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Invalid input: Student name cannot be empty.");
        }
        
        if (age < 0) {
            throw new IllegalArgumentException("Invalid age: Age cannot be negative.");
        }
        
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() { 
    	return name; 
    	}
    
    public void setName(String name) { 
    	this.name = name; 
    	}

    public int getAge() { 
    	return age; 
    	}
    
    public void setAge(int age) { 
    	this.age = age; 
    	}

    public String getId() { 
    	return id; 
    	}

    // Abstract method - Abstraction
    public abstract void displayInfo();

    // Sealed method (final)
    public final void greet() {
        System.out.println("Hello! I’m " + getName() + ", navigating the journey of learning through our Student Management System.");
    }
}
