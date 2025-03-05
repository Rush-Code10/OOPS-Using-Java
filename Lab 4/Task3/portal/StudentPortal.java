package portal;

import university.Student;

public class StudentPortal {
    public static void main(String[] args) {
        // Accessing private attributes directly is not allowed
        int[] marks = {85, 78, 92, 80, 90};
        Student student = new Student("Rushabh Shah", 126, "Computer Science", marks);

        // Only public methods can be accessed
        System.out.println("Student Name: " + student.getName());
        System.out.println("Roll No: " + student.getRollNo());
        System.out.println("Course: " + student.getCourse());
    }
}
