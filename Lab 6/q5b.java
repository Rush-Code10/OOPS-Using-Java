
public class q5b {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.display();
    }
}


final class Animal {
    void display() {
        System.out.println("Display method in Animal class");
    }
}

class Dog extends Animal {
    void display() {
        System.out.println("Display method in Dog class");
    }
}
