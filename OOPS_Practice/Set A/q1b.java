import java.util.*;

public class q1b
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        for(int i = 0; i<= 12; i++)
        {
            int mul = n * i;
            System.out.print(n + " x " + i + " = "+ mul);
            System.out.println();
        }
    }
}