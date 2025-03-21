// Grandparent class
class Animal {
    void sound() {
        System.out.println("Animals make sounds");
    }
}

// Parent class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Child class inheriting from Dog
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps");
    }
}

// Main class
public class multilevel_inheritance {
    public static void main(String[] args) {
        Puppy myPuppy = new Puppy();
        myPuppy.sound(); // Inherited from Animal
        myPuppy.bark();  // Inherited from Dog
        myPuppy.weep();  // Puppy’s own method
    }
}
