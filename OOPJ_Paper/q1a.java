public class q1a {
    // Method that returns the smallest positive integer n where sum from 1 to n >= goal
    public static int enough(int goal) {
        int sum = 0;
        int n = 0;
        
        while (sum < goal) {
            n++;
            sum += n;
        }
        
        return n;
    }
    
    public static void main(String[] args) {
        // Test case from the problem
        int result = enough(9);
        System.out.println("enough(9) returns " + result);
        
        // Verification
        int sum = 0;
        for (int i = 1; i <= result; i++) {
            sum += i;
        }
        System.out.println("Sum from 1 to " + result + " = " + sum);
    }
}