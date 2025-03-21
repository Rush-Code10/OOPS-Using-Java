import java.util.*;

public class q4
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter character: ");
        char c = sc.next().charAt(0);
        System.out.println("Character is " + c);

        int asc = (int)c;
        System.out.println("ASCII Value is " + asc);
    }
}