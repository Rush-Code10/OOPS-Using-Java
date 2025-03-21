// Parent class
class Animal {
    void sound() {
        System.out.println("Animals make sounds");
    }
}

// Interface 1
interface Pet {
    void friendly();
}

// Interface 2
interface Guard {
    void guard();
}

// Child class inheriting from Animal and implementing multiple interfaces
class Dog extends Animal implements Pet, Guard {
    public void friendly() {
        System.out.println("Dog is friendly");
    }

    public void guard() {
        System.out.println("Dog guards the house");
    }
}

// Main class
public class HybridInheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound();   // Inherited from Animal
        myDog.friendly(); // From Pet
        myDog.guard();    // From Guard
    }
}
