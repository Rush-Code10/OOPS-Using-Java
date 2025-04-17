// Base class for electricity billing
class Electricity {
    protected int units;
    
    // Constructor
    public Electricity(int units) {
        this.units = units;
    }
    
    // Method to compute the bill
    public double Bill() {
        double cost = 0;
        
        if (units <= 100) {
            cost = units * 0.50;
        } else if (units <= 300) {
            cost = 100 * 0.50 + (units - 100) * 0.60;
        } else {
            cost = 100 * 0.50 + 200 * 0.60 + (units - 300) * 0.60;
        }
        
        return cost;
    }
}

// Derived class that adds surcharge for high bills
class More_Electricity extends Electricity {
    // Constructor using super keyword to call the parent constructor
    public More_Electricity(int units) {
        super(units);
    }
    
    // Override the Bill method to add surcharge
    @Override
    public double Bill() {
        // Call the parent class Bill method
        double cost = super.Bill();
        
        // Add surcharge if cost exceeds Rs. 250
        if (cost > 250.0) {
            double surcharge = (cost - 250.0) * 0.15;
            cost += surcharge;
        }
        
        return cost;
    }
}

// Main class to test the implementation
public class q2 {
    public static void main(String[] args) {
        // Test with different consumption levels
        int[] testUnits = {80, 200, 400};
        
        for (int units : testUnits) {
            // Create base class object
            Electricity regular = new Electricity(units);
            double regularBill = regular.Bill();
            
            // Create derived class object
            More_Electricity withSurcharge = new More_Electricity(units);
            double totalBill = withSurcharge.Bill();
            
            System.out.println("Units consumed: " + units);
            System.out.println("Regular bill: Rs. " + regularBill);
            System.out.println("Bill with surcharge: Rs. " + totalBill);
            System.out.println();
        }
    }
}