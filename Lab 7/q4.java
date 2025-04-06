import java.util.InputMismatchException;
import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.print("Enter an index (0-4): ");
            int index = scanner.nextInt();
            if (index < 0 || index >= 5) {
                throw new ArrayIndexOutOfBoundsException();
            }
            if (number == 0) {
                throw new ArithmeticException();
            }
            double result = 10 / number;
            System.out.println("Result: " + result);
            System.out.println("Index is valid.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Input is not a valid integer.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Attempt to divide by zero.");
        } finally {
            System.out.println("Input process is complete.");
            scanner.close();
        }
    }
}
