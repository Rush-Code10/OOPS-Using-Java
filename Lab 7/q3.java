import java.util.InputMismatchException;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5};
        boolean validIndex = false;
        while (!validIndex) {
            try {
                System.out.print("Enter an index (0-4): ");
                int index = scanner.nextInt();
                if (index < 0 || index >= array.length) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                System.out.println("Element at index " + index + ": " + array[index]);
                validIndex = true;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Index out of bounds. Please enter a number between 0 and 4.");
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input. Please enter an integer.");
                scanner.next();
            }
        }
        System.out.println("Input process is complete.");
        scanner.close();
    }
}
