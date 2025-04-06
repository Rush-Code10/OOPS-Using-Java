import java.util.*;

public class q2 {
    public static void main(String[] args) {
        // Create a Set
        Set<String> set = new HashSet<>();

        // Add elements to the set
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple"); // Duplicate element

        // Display elements (duplicates will be ignored)
        System.out.println("Set: " + set);
    }
}
