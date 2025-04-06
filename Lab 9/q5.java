import java.util.*;

public class q5 {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Traverse using Iterator
        Iterator<String> iterator = linkedList.iterator();
        
        System.out.println("LinkedList Traversal using Iterator:");
        
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
