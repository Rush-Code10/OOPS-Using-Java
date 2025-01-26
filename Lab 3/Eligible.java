import java.util.Scanner;

class main{
	public static void main(String[] args){
		Eligible person1 = new Eligible();
		person1.input();
		person1.compute();
	}
}

public class Eligible{
	float held,attended;
	public void input(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of classes held : ");
		held = sc.nextFloat();
		System.out.print("Enter number of classes attended : ");
		attended = sc.nextFloat();
	}
	public void compute(){
		float atten = (attended/held) * 100;
		if(atten >80){
			System.out.println("Student is Permitted");
		}
		else{
			System.out.println("Student is not Permitted ");
		}
	}
}
