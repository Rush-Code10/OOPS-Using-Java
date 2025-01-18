import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int n1 = sc.nextInt();
        int rem;
        int rev = 0;

        while (n1 != 0) {
            rem = n1 % 10;
            rev = rev * 10 + rem;
            n1 = n1 / 10;
        }

        System.out.println("Reversed number: " + rev);

        sc.close();
    }
}
