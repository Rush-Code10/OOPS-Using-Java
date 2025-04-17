public class q1b {
    // Data members
    private int classesHeld;
    private int classesAttended;
    
    // Constructor
    public q1b() {
        classesHeld = 0;
        classesAttended = 0;
    }
    
    // Method to input data from user
    public void input() {
        // In a real application, you would use Scanner class
        // For demonstration purposes:
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.print("Enter number of classes held: ");
        classesHeld = scanner.nextInt();
        
        System.out.print("Enter number of classes attended: ");
        classesAttended = scanner.nextInt();
    }
    
    // Method to compute attendance percentage and verify eligibility
    public void compute() {
        // Calculate attendance percentage
        double percentage = (double) classesAttended / classesHeld * 100;
        
        // Display the percentage
        System.out.println("Attendance Percentage: " + percentage + "%");
        
        // Check if student is eligible (80% or more attendance)
        if (percentage >= 80) {
            System.out.println("Student permitted to appear in the exam");
        } else {
            System.out.println("Student not allowed to appear in the exam");
        }
    }
    
    // Main method to create instance and invoke methods
    public static void main(String[] args) {
        // Create an instance of Eligible class
        q1b student = new q1b();
        
        // Call input method to get data
        student.input();
        
        // Call compute method to determine eligibility
        student.compute();
    }
}