import java.util.*;

public class q2
{
    public static void main(String[]args)
    {
        int n = 5;
        for (int i = n; i>=1; i--)
        {
            int k = 0;
            for (int j = i; j>=1; j-- )
            {
                k = k + 1;
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}