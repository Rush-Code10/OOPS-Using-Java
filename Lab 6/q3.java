public class q3 {
    public static void main(String[] args) {
        Payment creditCardPayment = new CreditCardPayment("1234-5678-9876-5432", "John Doe", 5000, "12/25");
        Payment debitCardPayment = new DebitCardPayment("4321-8765-6789-1234", "Jane Smith", 3000, "1234");

        creditCardPayment.processPayment();
        creditCardPayment.displayPaymentDetails();

        System.out.println();

        debitCardPayment.processPayment();
        debitCardPayment.displayPaymentDetails();
    }
}

abstract class Payment {
    String cardNumber;
    String cardHolder;
    double amount;

    public Payment(String cardNumber, String cardHolder, double amount) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.amount = amount;
    }

    abstract void processPayment();
    abstract void displayPaymentDetails();
}

class CreditCardPayment extends Payment {
    String expiryDate;

    public CreditCardPayment(String cardNumber, String cardHolder, double amount, String expiryDate) {
        super(cardNumber, cardHolder, amount);
        this.expiryDate = expiryDate;
    }

    @Override
    void processPayment() {
        System.out.println("Credit Card Payment Processed");
    }

    @Override
    void displayPaymentDetails() {
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Card Holder: " + cardHolder);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Amount: Rs. " + amount);
    }
}

class DebitCardPayment extends Payment {
    String pin;

    public DebitCardPayment(String cardNumber, String cardHolder, double amount, String pin) {
        super(cardNumber, cardHolder, amount);
        this.pin = pin;
    }

    @Override
    void processPayment() {
        System.out.println("Debit Card Payment Processed");
    }

    @Override
    void displayPaymentDetails() {
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Card Holder: " + cardHolder);
        System.out.println("PIN: " + pin);
        System.out.println("Amount: Rs. " + amount);
    }
}

