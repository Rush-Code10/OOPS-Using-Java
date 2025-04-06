import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b;
        int res;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        try{
            res = a/b;
            System.out.println("Result: " + res);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Divide by 0");
        }
        finally{
            System.out.println("Remaining Code");
        }
    }   
}
