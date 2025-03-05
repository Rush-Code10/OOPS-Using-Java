import employee.*;

public class Emppay {
    public static void main(String[] args) {
        Emp e = new Emp("John Doe", 12345, "Manager", 50000.0);

        e.calculateHRA();
        e.calculateDA();
        e.calculatePF();
        e.calculateIncomeTax();
        e.calculateAllowance();
        e.calculateGrossPay();
        e.calculateNetPay();

        e.printDetails();
    }
}
