public class q1{
    public static void main(String[]args)
    {
        Circle c = new Circle(6);
        c.display();
        c.area();
        c.perimeter();
    }
}
interface Shape{
    void area();
    void perimeter();
}

abstract class Ashape implements Shape{
    String name;
    public Ashape(String name)
    {
        this.name = name;
    }
    public void display(){
        System.out.println("Shape name is: "+name);
    }
}

class Circle extends Ashape{
    double radius;
    public Circle(double radius)
    {
        super("Circle");
        this.radius = radius;
    }
    @Override
    public void area(){
        System.out.println("Area of circle is: "+(3.14*radius*radius));
    }
    @Override
    public void perimeter(){
        System.out.println("Perimeter of a circle is: "+(2*3.14*radius));
    }
}

