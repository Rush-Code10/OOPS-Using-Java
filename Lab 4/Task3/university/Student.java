package university;

public class Student {
    private String name;
    private int roll_no;
    private String course;
    private int[] marks;

    // Constructor
    public Student(String name, int roll_no, String course, int[] marks) {
        this.name = name;
        this.roll_no = roll_no;
        this.course = course;
        this.marks = marks;
    }

    // Calculate total marks
    public int getTotalMarks() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    // Calculate percentage
    public double getPercentage() {
        return (double) getTotalMarks() / marks.length;
    }

    // Getters for derived class
    protected int[] getMarks() {
        return marks;
    }

    // Public method to get name
    public String getName() {
        return name;
    }

    public int getRollNo() {
        return roll_no;
    }

    public String getCourse() {
        return course;
    }
}
