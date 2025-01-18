import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        int rev = 0, rem, a, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        a = sc.nextInt();
        temp = a;
        while (a != 0) {
            rem = a % 10;
            rev = rev * 10 + rem;
            a = a / 10;
        }
        System.out.println("Reverse of number is: " + rev);
        if (rev == temp)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        sc.close();
    }
}
