// Parent class
class Animal {
    void sound() {
        System.out.println("Animals make sounds");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Main class
public class single_lvl_inheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound(); // Inherited method
        myDog.bark();  // Child's own method
    }
}
