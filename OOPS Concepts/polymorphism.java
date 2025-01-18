public class Polymorphism {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(5, 10));
        System.out.println(c.add(5, 13.3f));
        System.out.println(c.add(5, 10, 15));
    }
}

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, float b) {
        int c = (int) b;
        return a + c;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
