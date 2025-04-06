class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Deposit amount cannot be negative.");
            return;
        }
        balance += amount;
        System.out.println("Deposited: " + amount);
        displayBalance();
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance for withdrawal");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
        displayBalance();
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class q5 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);
        account.deposit(500.0);
        account.deposit(-200.0);

        try {
            account.withdraw(200.0);
            account.withdraw(1500.0);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
