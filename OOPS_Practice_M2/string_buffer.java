public class StringBufferExample {
    public static void main(String[] args) {
        // 1. Creating a StringBuffer
        StringBuffer sb = new StringBuffer("Hello");

        // a. append(String s) - Adds string to the end
        sb.append(" World");
        System.out.println("Append: " + sb); // Output: Hello World

        // b. insert(int offset, String s) - Inserts string at a specific index
        sb.insert(5, " Java");
        System.out.println("Insert: " + sb); // Output: Hello Java World

        // c. replace(int startIndex, int endIndex, String str) - Replaces substring in range
        sb.replace(6, 10, "Python");
        System.out.println("Replace: " + sb); // Output: Hello Python World

        // d. delete(int startIndex, int endIndex) - Deletes characters in range
        sb.delete(6, 12);
        System.out.println("Delete: " + sb); // Output: Hello World

        // e. reverse() - Reverses the string
        sb.reverse();
        System.out.println("Reverse: " + sb); // Output: dlroW olleH
        sb.reverse(); // Reverting back

        // f. capacity() - Returns current buffer capacity
        System.out.println("Capacity: " + sb.capacity()); // Default: 16 + length of string

        // g. ensureCapacity(int minimumCapacity) - Ensures buffer has a minimum capacity
        sb.ensureCapacity(50);
        System.out.println("New Capacity: " + sb.capacity()); // Ensures at least 50

        // h. charAt(int index) - Returns character at specified index
        System.out.println("Character at index 1: " + sb.charAt(1)); // Output: e

        // i. length() - Returns current length of the string
        System.out.println("Length: " + sb.length()); // Output: 11

        // j. substring(int beginIndex) - Extracts substring from a given index
        System.out.println("Substring (start at 6): " + sb.substring(6)); // Output: World

        // k. substring(int beginIndex, int endIndex) - Extracts substring in range
        System.out.println("Substring (6, 11): " + sb.substring(6, 11)); // Output: World
    }
}
