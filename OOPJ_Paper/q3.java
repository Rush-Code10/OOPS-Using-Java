// Base class Member
class Member {
    // Data members
    protected String name;
    protected int age;
    protected String phoneNumber;
    protected String address;
    protected double salary;
    
    // Constructor
    public Member(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }
    
    // Method to print salary
    public void printSalary() {
        System.out.println("Salary: Rs. " + salary);
    }
    
    // Method to display member details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Address: " + address);
        printSalary();
    }
}

// Derived class Employee
class Employee extends Member {
    // Additional data member
    private String specialization;
    
    // Constructor
    public Employee(String name, int age, String phoneNumber, String address, 
                    double salary, String specialization) {
        // Call parent constructor using super
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }
    
    // Method to display employee details
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Specialization: " + specialization);
    }
}

// Derived class Manager
class Manager extends Member {
    // Additional data member
    private String department;
    
    // Constructor
    public Manager(String name, int age, String phoneNumber, String address, 
                  double salary, String department) {
        // Call parent constructor using super
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }
    
    // Method to display manager details
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}

// Main class to test the implementation
public class q3 {
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee("John Smith", 28, "9876543210", 
                                   "123 Main St, City", 50000.0, "Software Development");
        
        // Create a Manager object
        Manager mgr = new Manager("Jane Doe", 35, "8765432109", 
                                 "456 Park Ave, City", 75000.0, "Information Technology");
        
        // Display Employee details
        System.out.println("EMPLOYEE DETAILS:");
        emp.displayDetails();
        System.out.println();
        
        // Display Manager details
        System.out.println("MANAGER DETAILS:");
        mgr.displayDetails();
    }
}