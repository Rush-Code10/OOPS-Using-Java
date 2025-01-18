/* Abstraction: it is a process of hiding the implementation, by only showing the functionality to the user.*/

public class abstraction
{
    public static void main(String [] args)
    {
        Bike b = new Honda();
        b.run();
    }
}

/* focuses on what object does instead of how it does it */

abstract class Bike
{
    void run()
    {}
}

class Honda extends Bike{
    void run()
    {
        System.out.println("Honda bike running");
    }
}