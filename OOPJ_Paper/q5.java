import java.util.ArrayList;
import java.util.Arrays;

public class q5 {
    
    // Method to calculate sum of all elements in an ArrayList of integers
    public static int sumArrayList(ArrayList<Integer> list) {
        int sum = 0;
        
        // Iterate through each element and add to sum
        for (Integer num : list) {
            sum += num;
        }
        
        return sum;
    }
    
    public static void main(String[] args) {
        // Create and initialize several ArrayLists for testing
        
        // Test case 1: ArrayList with positive integers
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(5, 10, 15, 20, 25));
        System.out.println("List 1: " + list1);
        System.out.println("Sum of List 1: " + sumArrayList(list1));
        
        // Test case 2: ArrayList with negative integers
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(-3, -6, -9, -12));
        System.out.println("\nList 2: " + list2);
        System.out.println("Sum of List 2: " + sumArrayList(list2));
        
        // Test case 3: ArrayList with mixed integers
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(7, -4, 9, -2, 5, -8));
        System.out.println("\nList 3: " + list3);
        System.out.println("Sum of List 3: " + sumArrayList(list3));
        
        // Test case 4: Empty ArrayList
        ArrayList<Integer> list4 = new ArrayList<>();
        System.out.println("\nList 4: " + list4);
        System.out.println("Sum of List 4: " + sumArrayList(list4));
        
        // Alternative implementation using Java 8 Stream API
        System.out.println("\n--- Using Stream API ---");
        int sum1 = list1.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of List 1 using streams: " + sum1);
    }
}