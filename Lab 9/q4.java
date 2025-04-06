import java.util.*;

public class q4 {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        // Traverse using For-Each Loop
        System.out.println("ArrayList Traversal using For-Each Loop:");
        
        for (String item : arrayList) {
            System.out.println(item);
        }
    }
}
