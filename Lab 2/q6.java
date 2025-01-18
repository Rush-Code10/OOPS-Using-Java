import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int n = sc.nextInt();

        if (n < 100 || n > 999) {
            System.out.println("Please enter a valid 3-digit number.");
            sc.close();
            return;
        }

        int sum = 0;
        int temp = n;

        while (n != 0) {
            int rem = n % 10;
            sum += rem * rem * rem;
            n /= 10;
        }

        System.out.println("Sum of cubes of digits: " + sum);

        if (temp == sum) {
            System.out.println(temp + " is an Armstrong Number.");
        } else {
            System.out.println(temp + " is not an Armstrong Number.");
        }

        sc.close();
    }
}
