import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Account Number: ");
		String accountNumber = sc.nextLine();
        
		System.out.print("Enter Initial Balance: ");
		double balance = sc.nextDouble();
        
		Account account = new Account(accountNumber, balance);
		account.displayDetails();
    }
}

public class Account {
	String accountNumber;
	double balance;
	public Account(String accountNumber, double balance) {
		if (accountNumber == null || accountNumber.isEmpty()) {
			System.out.println("Account number cannot be null or empty.");
			return;
	}

        	if (balance < 0) {
           		System.out.println("Balance cannot be negative.");
			return;
		}
	this.accountNumber = accountNumber;
        this.balance = balance;
	}
	public void displayDetails() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Account Balance: " + balance);
    	}
}
