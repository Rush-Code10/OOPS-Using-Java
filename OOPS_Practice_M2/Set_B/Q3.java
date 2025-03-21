// Interface 1: BankAccount
interface BankAccount {
    void deposit(double amount);
}

// Interface 2: Loan
interface Loan {
    void applyForLoan(double amount);
}

// Customer class implementing both interfaces
class Customer implements BankAccount, Loan {
    private double balance = 0;

    // Implement deposit method
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
        System.out.println("Current Balance: $" + balance);
    }

    // Implement applyForLoan method
    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan Applied for: $" + amount);
    }
}

// Main class
public class Q3 {
    public static void main(String[] args) {
        Customer customer = new Customer();

        // Demonstrate deposit and loan application
        customer.deposit(1000);
        customer.applyForLoan(5000);
    }
}
