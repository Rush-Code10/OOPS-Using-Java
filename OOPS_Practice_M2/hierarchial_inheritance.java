// Parent class
class Animal {
    void sound() {
        System.out.println("Animals make sounds");
    }
}

// First child class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Second child class
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

// Main class
public class hierarchial_inheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        myDog.sound(); // Inherited from Animal
        myDog.bark();  // Dog's own method

        myCat.sound(); // Inherited from Animal
        myCat.meow();  // Cat's own method
    }
}
