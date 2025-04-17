public class q1d {
    public static void main(String[] args) {
        // Create an array
        int[] numbers = {1, 2, 3, 4, 5};
        
        System.out.println("Array created with 5 elements (indexes 0-4)");
        
        // Demonstrate safe access (within bounds)
        try {
            System.out.println("\nTrying to access a valid index (index 2):");
            int value = numbers[2];
            System.out.println("Value at index 2: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // Demonstrate exception (beyond upper bound)
        try {
            System.out.println("\nTrying to access beyond upper bound (index 10):");
            int value = numbers[10]; // This will cause ArrayIndexOutOfBoundsException
            System.out.println("This line won't execute");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds");
            System.out.println("Exception details: " + e.getMessage());
        }
        
        // Demonstrate exception (negative index)
        try {
            System.out.println("\nTrying to access negative index (index -1):");
            int value = numbers[-1]; // This will cause ArrayIndexOutOfBoundsException
            System.out.println("This line won't execute");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Negative index not allowed");
            System.out.println("Exception details: " + e.getMessage());
        } finally {
            System.out.println("\nFinally block executes regardless of exception");
        }
        
        System.out.println("\nProgram continues execution after handling exceptions");
    }
}