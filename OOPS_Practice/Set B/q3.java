import java.util.*;

class Bird
{
    String name;
    int age;
    public Bird()
    {
        this.name = "";
        this.age = 0;
        System.out.println("A Bird is created with empty values.");
    }
    public Bird(String name)
    {
        this.name = name;
        this.age = 0;
        System.out.println("A Bird with "+ name + " is created.");
    }
    public Bird(String name, int age)
    {
        this.name = name;
        this.age = age;
        System.out.println("A Bird with "+name+" and age: "+age+" is created.");
    }
}
public class q3
{
    public static void main(String[]args)
    {
        Bird b1 = new Bird();
        Bird b2 = new Bird("Sparrow");
        Bird b3 = new Bird("Sparrow", 10);
    }
}