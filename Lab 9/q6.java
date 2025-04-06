import java.util.*;

public class q6 {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Traverse using For-Each Loop
        System.out.println("LinkedList Traversal using For-Each Loop:");
        
        for (String item : linkedList) {
            System.out.println(item);
        }
    }
}
