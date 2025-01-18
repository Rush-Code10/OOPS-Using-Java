import java.util.Scanner;
public class q4 {
    public static void main(String[]args)
	{
	Scanner sc = new Scanner(System.in);
	String name = sc.nextLine();
	int age = sc.nextInt();
	long number = sc.nextLong();
	int m1 = sc.nextInt();
	int m2 = sc.nextInt();
	int m3 = sc.nextInt();
	System.out.println(name+" "+age+" "+number);
	int avg = (m1+m2+m3)/3;
	System.out.print("Average Marks: ");
	System.out.print(avg);
	}
}
