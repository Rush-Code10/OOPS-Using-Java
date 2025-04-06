import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a number to divide by: ");
            int divisor = scanner.nextInt();
            divide(divisor);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }

        try {
            System.out.print("Enter an index for an array of size 5: ");
            int index = scanner.nextInt();
            accessArray(index);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }

    public static void divide(int divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        System.out.println("Division successful.");
    }

    public static void accessArray(int index) throws ArrayIndexOutOfBoundsException {
        int[] array = {1, 2, 3, 4, 5};
        if (index < 0 || index >= array.length) {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds.");
        }
        System.out.println("Element at index " + index + ": " + array[index]);
    }
}
