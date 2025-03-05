import security.PasswordMasker;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        // Mask password using PasswordMasker class
        String maskedPassword = PasswordMasker.maskPassword(password);
        System.out.println("Masked Password: " + maskedPassword);

        scanner.close();
    }
}
