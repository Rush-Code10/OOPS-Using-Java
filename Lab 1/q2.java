import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	System.out.print("a and b are: ");
	System.out.println(a+" "+b);
	int c = a;
	a = b;
	b = c;
	System.out.print("a and b are: ");
	System.out.print(a+" "+b);
    }
}
