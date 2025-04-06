import java.util.*;

public class q1 {
    public static void main(String[] args) {
        // Create a list
        List<String> list = new ArrayList<>();

        // Create: Add elements to the list
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        // Read: Display elements
        System.out.println("List: " + list);

        // Update: Modify an element
        list.set(1, "Mango");
        System.out.println("Updated List: " + list);

        // Delete: Remove an element
        list.remove("Orange");
        System.out.println("List after deletion: " + list);
    }
}
