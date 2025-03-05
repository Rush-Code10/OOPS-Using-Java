import attendance.*;
import java.util.Scanner;

public class AttendanceReport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for employee attendance
        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Employee ID: ");
        int empID = scanner.nextInt();

        System.out.print("Enter Total Working Days: ");
        int totalWorkingDays = scanner.nextInt();

        System.out.print("Enter Days Present: ");
        int daysPresent = scanner.nextInt();

        // Creating EmployeeAttendance object
        EmployeeAttendance employee = new EmployeeAttendance(name, empID, totalWorkingDays, daysPresent);

        // Displaying attendance details
        System.out.println("\nAttendance Summary:");
        employee.displayAttendance();

        scanner.close();
    }
}
