import java.util.*;

class Student
{
    String name;
    int rollnum;
    double m1,m2,m3,m4;

    public void inputDetails()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter rollnum: ");
        rollnum = sc.nextInt();
        System.out.print("Enter marks of 4 subjects: ");
        m1 = sc.nextDouble();
        m2 = sc.nextDouble();
        m3 = sc.nextDouble();
        m4 = sc.nextDouble();
    }
    public double percentage()
    {
        return ((m1+m2+m3+m4)/400)*100;
    }
    public void display()
    {
        System.out.println(name);
        System.out.println(rollnum);
        System.out.println(percentage() + "");
    }
}

public class q3
{
    public static void main(String[]args)
    {
        Student s = new Student();
        s.inputDetails();
        s.display();
    }
}