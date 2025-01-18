import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        int sum = 0, rem, number;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = sc.nextInt();

        while (number != 0) {
            rem = number % 10;
            sum += rem;
            number /= 10;
        }

        System.out.println("Sum of digits is: " + sum);
        sc.close();
    }
}
