public class q5a {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.display();
    }
}
class Animal {
    final void display() {
        System.out.println("Display method in Animal class");
    }
}

class Dog extends Animal {
    void display() {
        System.out.println("Display method in Dog class");
    }
}

// Can't be overriden


