package employee;

public class Emp {
    private String name;
    private int emp_id;
    private String category;
    private double basic_pay;
    private double hra;
    private double da;
    private double net_pay;
    private double PF;
    private double gross_pay;
    private double income_tax;
    private double allowance;

    public Emp(String name, int emp_id, String category, double basic_pay) {
        this.name = name;
        this.emp_id = emp_id;
        this.category = category;
        this.basic_pay = basic_pay;
    }

    public void calculateHRA() {
        this.hra = 0.2 * basic_pay;
    }

    public void calculateDA() {
        this.da = 0.1 * basic_pay;
    }

    public void calculatePF() {
        this.PF = 0.12 * basic_pay;
    }

    public void calculateIncomeTax() {
        this.income_tax = 0.05 * (basic_pay + hra + da);
    }

    public void calculateAllowance() {
        this.allowance = 0.05 * basic_pay;
    }

    public void calculateGrossPay() {
        this.gross_pay = basic_pay + hra + da + allowance;
    }

    public void calculateNetPay() {
        this.net_pay = gross_pay - PF - income_tax;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Category: " + category);
        System.out.println("Basic Pay: " + basic_pay);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("PF: " + PF);
        System.out.println("Gross Pay: " + gross_pay);
        System.out.println("Income Tax: " + income_tax);
        System.out.println("Allowance: " + allowance);
        System.out.println("Net Pay: " + net_pay);
    }
}
