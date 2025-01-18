/* Encapuslation is the process of wrapping code together int 1 unit*/

import java.util.Scanner;

public class Encapsulation {
    public static void main(String[] args) {
        Student s1 = new Student();
        
        s1.setsapid();
        s1.setName();

        System.out.println("SAP ID: " + s1.getsapid());
        System.out.println("Name: " + s1.getName());
    }
}

class Student {
    private int sapid;
    private String name;
    private Scanner scanner = new Scanner(System.in);

    public void setsapid() {
        System.out.print("Enter SAP ID: ");
        this.sapid = scanner.nextInt();
        scanner.nextLine();
    }

    public int getsapid() {
        return sapid;
    }

    public void setName() {
        System.out.print("Enter Name: ");
        this.name = scanner.nextLine();
    }

    public String getName() {
        return name;
    }

    public void closeScanner() {
        scanner.close();
    }
}
