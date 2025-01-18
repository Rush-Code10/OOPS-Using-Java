import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting number (n1): ");
        int n1 = sc.nextInt();
        System.out.print("Enter the ending number (n2): ");
        int n2 = sc.nextInt();

        for (int i = n1; i <= n2; i++) {

            int flag = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    flag++;
                }
            }

            if (flag == 2) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
