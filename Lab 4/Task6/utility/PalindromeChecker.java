package utility;

public class PalindromeChecker {
    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String input) {
        // Convert to lowercase and remove non-alphanumeric characters
        String cleaned = input.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        StringBuffer reversed = new StringBuffer(cleaned).reverse();

        return cleaned.equals(reversed.toString());
    }
}
