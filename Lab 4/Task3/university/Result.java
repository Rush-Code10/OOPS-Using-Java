package university;

public class Result extends Student {
    public Result(String name, int roll_no, String course, int[] marks) {
        super(name, roll_no, course, marks);
    }

    // Calculate grade
    public char getGrade() {
        double percentage = getPercentage();
        if (percentage >= 90) return 'A';
        else if (percentage >= 75) return 'B';
        else if (percentage >= 60) return 'C';
        else return 'D';
    }

    // Display result
    public void displayResult() {
        System.out.println("Student: " + getName());
        System.out.println("Roll No: " + getRollNo());
        System.out.println("Course: " + getCourse());
        System.out.println("Total Marks: " + getTotalMarks());
        System.out.println("Percentage: " + getPercentage() + "%");
        System.out.println("Grade: " + getGrade());
    }
}
