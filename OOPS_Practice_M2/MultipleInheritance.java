// First interface
interface Animal {
    void sound();
}

// Second interface
interface Pet {
    void friendly();
}

// Class implementing both interfaces
class Dog implements Animal, Pet {
    public void sound() {
        System.out.println("Dog barks");
    }

    public void friendly() {
        System.out.println("Dog is friendly");
    }
}

// Main class
public class MultipleInheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound();   // From Animal
        myDog.friendly(); // From Pet
    }
}
