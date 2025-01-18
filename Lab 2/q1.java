import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        int num1, num2, num3, largest, smallest;
        Scanner sc = new Scanner(System.in);

        // Input numbers
        System.out.print("Enter first number: ");
        num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            largest = num1;
            System.out.println("Largest number is: " + largest);
        } else if (num2 > num1 && num2 > num3) {
            largest = num2;
            System.out.println("Largest number is: " + largest);
        } else {
            largest = num3;
            System.out.println("Largest number is: " + largest);
        }

        if (num1 < num2 && num1 < num3) {
            smallest = num1;
            System.out.println("Smallest number is: " + smallest);
        } else if (num2 < num1 && num2 < num3) {
            smallest = num2;
            System.out.println("Smallest number is: " + smallest);
        } else {
            smallest = num3;
            System.out.println("Smallest number is: " + smallest);
        }

        int sum = num1 + num2 + num3;
        System.out.println("Sum of the three numbers is: " + sum);

        sc.close();
    }
}
