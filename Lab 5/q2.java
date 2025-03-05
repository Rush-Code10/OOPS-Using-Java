import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();
        System.out.print("Enter name for Employee: ");
        emp.name = sc.nextLine();
        System.out.print("Enter age for Employee: ");
        emp.age = sc.nextInt();
        System.out.print("Enter salary for Employee: ");
        emp.salary = sc.nextDouble();
        emp.display();
        emp.display_Emp();

        sc.nextLine(); // Consume the leftover newline character

        Manager mgr = new Manager();
        System.out.print("Enter name for Manager: ");
        mgr.name = sc.nextLine();
        System.out.print("Enter age for Manager: ");
        mgr.age = sc.nextInt();
        System.out.print("Enter salary for Manager: ");
        mgr.salary = sc.nextDouble();
        sc.nextLine(); // Consume the leftover newline character
        System.out.print("Enter department for Manager: ");
        mgr.department = sc.nextLine();
        mgr.display();
        mgr.display_Manager();
    }
}

class Person {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    double salary;

    void display_Emp() {
        super.display();
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;

    void display_Manager() {
        super.display_Emp();
        System.out.println("Department: " + department);
    }
}
