import java.util.*;

public class q3 {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        // Traverse using Iterator
        Iterator<String> iterator = arrayList.iterator();
        
        System.out.println("ArrayList Traversal using Iterator:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
