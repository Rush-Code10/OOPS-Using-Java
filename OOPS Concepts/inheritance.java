/*Inheritance: It is the mechanism in Java by which one class is allowed to inherit the features(fields and methods) of another class*/

public class inheritance
{
    public static void main(String [] args)
    {
        Cub c = new Cub();
        c.crawl();
        c.roar();
        c.eat();
    }
}

class Animal
{
    void eat()
    {
        System.out.println("eating...");
    }
}

class Lion extends Animal
{
    void roar()
    {
        System.out.println("roaring...");
    }
}

class Cub extends Lion
{
    void crawl()
    {
        System.out.println("crawling...");
    }
}