import java.util.*;

public class q4
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        System.out.println("Enter phone number: ");
        long num = sc.nextLong();
        System.out.println("Enter 4 subject marks: ");
        float m1 = sc.nextFloat();
        float m2 = sc.nextFloat();
        float m3 = sc.nextFloat();
        float m4 = sc.nextFloat();
        float average = (m1+m2+m3+m4)/4;
        System.out.println(name);
        System.out.println(age);
        System.out.println(num);
        System.out.println(average);

    }
}