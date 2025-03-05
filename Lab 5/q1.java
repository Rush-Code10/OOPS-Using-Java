import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Marks student1 = new Marks();
        student1.InputData();
        student1.ReadData();
        student1.Compute();
        student1.Show();
    }
}

class Student {
    String name;
    int rollNumber;
    String dateOfBirth;

    void InputData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter roll number: ");
        rollNumber = sc.nextInt();
        sc.nextLine(); // consume the newline character
        System.out.print("Enter date of birth: ");
        dateOfBirth = sc.nextLine();
    }
}

class Marks extends Student {
    int[] marks = new int[5];
    int total;
    double percentage;
    String grade;

    void ReadData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks for 5 subjects out of 100:");
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
        }
    }

    void Compute() {
        total = 0;
        for (int i = 0; i < 5; i++) {
            total += marks[i];
        }
        percentage = (total / 500.0) * 100;
        if (percentage >= 90)
            grade = "A";
        else if (percentage >= 80)
            grade = "B";
        else if (percentage >= 70)
            grade = "C";
        else if (percentage >= 60)
            grade = "D";
        else
            grade = "F";
    }

    void Show() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.print("Marks: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println("\nTotal: " + total);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);
    }
}
