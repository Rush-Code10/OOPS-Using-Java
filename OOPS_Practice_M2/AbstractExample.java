// Abstract class
abstract class Animal {
    // Abstract method (does not have a body)
    abstract void makeSound();

    // Concrete method (has a body)
    void sleep() {
        System.out.println("Sleeping...");
    }
}

// Subclass (inheriting from Animal)
class Dog extends Animal {
    // Implementing abstract method
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Main class
public class AbstractExample {
    public static void main(String[] args) {
        Dog myDog = new Dog(); // ✅ Allowed (Dog is concrete)
        myDog.makeSound(); // Calls the implemented method
        myDog.sleep(); // Calls inherited method
    }
}
