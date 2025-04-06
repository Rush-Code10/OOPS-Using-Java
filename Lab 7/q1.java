import java.util.InputMismatchException;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a valid integer: ");
            int number = scanner.nextInt();
            System.out.println("You entered: " + number);
        } catch (InputMismatchException e) {
            System.out.println("Error: Input is not a valid integer.");
        } finally {
            System.out.println("Input process is complete.");
            scanner.close();
        }
    }
}
