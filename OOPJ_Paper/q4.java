// Interface for land animals
interface LandAnimal {
    void move();
}

// Interface for aquatic animals
interface AquaticAnimal {
    void swim();
}

// Base Animal class
class Animal {
    public void makeSound() {
        System.out.println("Animal is making a sound");
    }
}

// Class for land mammals - inherits Animal class and implements LandAnimal interface
class LandMammal extends Animal implements LandAnimal {
    @Override
    public void move() {
        System.out.println("Land mammal is moving on land");
    }
    
    @Override
    public void makeSound() {
        System.out.println("Land mammal is making a sound");
    }
}

// Class for aquatic mammals - inherits Animal class and implements AquaticAnimal interface
class AquaticMammal extends Animal implements AquaticAnimal {
    @Override
    public void swim() {
        System.out.println("Aquatic mammal is swimming");
    }
    
    @Override
    public void makeSound() {
        System.out.println("Aquatic mammal is making a sound");
    }
}

// Hybrid mammal class - inherits from LandMammal and implements AquaticAnimal interface
// Note: Java doesn't support multiple inheritance of classes, so we inherit from one class
// and implement the other functionality through an interface
class HybridMammal extends LandMammal implements AquaticAnimal {
    @Override
    public void swim() {
        System.out.println("Hybrid mammal is swimming");
    }
    
    @Override
    public void move() {
        System.out.println("Hybrid mammal is moving on land");
    }
    
    @Override
    public void makeSound() {
        System.out.println("Hybrid mammal is making a sound");
    }
}

// Main class to demonstrate the hybrid inheritance
public class q4 {
    public static void main(String[] args) {
        // Create objects of each class
        LandMammal landMammal = new LandMammal();
        AquaticMammal aquaticMammal = new AquaticMammal();
        HybridMammal hybridMammal = new HybridMammal();
        
        // Test LandMammal methods
        System.out.println("--- Land Mammal ---");
        landMammal.makeSound();
        landMammal.move();
        
        // Test AquaticMammal methods
        System.out.println("\n--- Aquatic Mammal ---");
        aquaticMammal.makeSound();
        aquaticMammal.swim();
        
        // Test HybridMammal methods
        System.out.println("\n--- Hybrid Mammal ---");
        hybridMammal.makeSound();
        hybridMammal.move();
        hybridMammal.swim();
    }
}