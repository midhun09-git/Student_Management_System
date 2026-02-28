# **Student Management System**

## **Description**
The Student Management System is a clean and modular Java–MySQL project designed to manage student and teacher records using Object-Oriented Programming (OOP) principles and JDBC.  
The system stores data in a MySQL database, retrieves records dynamically, and displays them through a well-formatted console interface.  
It demonstrates real-world software engineering concepts such as the DAO pattern, inheritance, interfaces, enums, and a scalable project structure suitable for academic or enterprise environments.

---

## **Features**
- CRUD operations for Students and Teachers  
- MySQL integration using JDBC  
- Automatic 10% salary bonus calculation for teachers  
- OOP concepts: inheritance, polymorphism, interfaces, enums  
- Clean and formatted console output  
- Modular architecture using DAO classes

---

## **Technologies Used**
- Java 17+  
- MySQL Workbench  
- JDBC  
- Eclipse IDE

---

## **Database Schema**

### Students Table
```sql
CREATE TABLE students (
    id VARCHAR(10) PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    age INT NOT NULL,
    grade_level VARCHAR(20) NOT NULL,
    gpa DOUBLE NOT NULL
);
```

### Teachers Table
```sql
CREATE TABLE teachers (
    id VARCHAR(10) PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    age INT NOT NULL,
    department VARCHAR(20) NOT NULL,
    salary DOUBLE NOT NULL
);
```

---

## **Setup Instructions**

### 1. Clone the Repository
```bash
git clone git@github.com:elishaxain/StudentManagementSystem.git
```

### 2. Import into Eclipse
```
File → Import → Existing Java Project → Select Folder
```

### 3. Configure Database Credentials
Open `DBConnection.java` and update the following fields with your **local MySQL credentials**:

```java
String url = "jdbc:mysql://localhost:3306/schoolman_system"; // your database host and name
String username = "your_mysql_username";                     // replace with your MySQL username
String password = "your_mysql_password";                     // replace with your MySQL password
```

Make sure your MySQL server is running on **localhost** and the database `schoolman_system` exists.  
You can create it using:

```sql
CREATE DATABASE IF NOT EXISTS schoolman_system;
USE schoolman_system;
```

### 4. Run the Project
Run the main class:
```
studentmanagementsystem.java
```

---

## **Usage**
- Retrieves and displays all student and teacher records from MySQL  
- Shows personalized student and teacher profiles  
- Calculates teacher salary bonuses  
- Supports database updates and deletion using DAO classes  
- Demonstrates industry-style Java coding and project structure

---

## **Contributing**
1. Fork the repository  
2. Create a new branch  
3. Commit your changes  
4. Submit a Pull Request

---

## **License**
This project is open-source and free to use for learning and development.
