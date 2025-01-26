import java.util.Scanner;

class main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter title: ");
		String title = sc.nextLine();
		System.out.print("Enter Author: ");
		String author = sc.nextLine();
		System.out.print("Enter Price: ");
		Double price = sc.nextDouble();
		LibraryBook book1 = new LibraryBook(title,author,price);
		book1.displayDetails();
	}
}

public class LibraryBook{
	String title, author;
	double price;
	LibraryBook(String title,String author,double price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public void displayDetails(){
		System.out.println("Title: "+ title);
		System.out.println("Author: "+ author);
		System.out.println("Price: "+ price);
	}
}
