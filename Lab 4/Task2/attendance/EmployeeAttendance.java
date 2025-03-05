// EmployeeAttendance.java
package attendance;

import java.util.Scanner;

public class EmployeeAttendance {
    private String name;
    private int empID;
    private int totalWorkingDays;
    private int daysPresent;
    private int daysAbsent;
    private double attendancePercentage;

    // Constructor
    public EmployeeAttendance(String name, int empID, int totalWorkingDays, int daysPresent) {
        this.name = name;
        this.empID = empID;
        this.totalWorkingDays = totalWorkingDays;
        this.daysPresent = daysPresent;
        this.daysAbsent = totalWorkingDays - daysPresent;
        calculateAttendancePercentage();
    }

    // Method to calculate attendance percentage
    private void calculateAttendancePercentage() {
        if (totalWorkingDays > 0) {
            attendancePercentage = ((double) daysPresent / totalWorkingDays) * 100;
        } else {
            attendancePercentage = 0;
        }
    }

    // Method to display attendance records
    public void displayAttendance() {
        System.out.println("Employee ID: " + empID);
        System.out.println("Name: " + name);
        System.out.println("Total Working Days: " + totalWorkingDays);
        System.out.println("Days Present: " + daysPresent);
        System.out.println("Days Absent: " + daysAbsent);
        System.out.printf("Attendance Percentage: %.2f%%\n", attendancePercentage);
    }
}
