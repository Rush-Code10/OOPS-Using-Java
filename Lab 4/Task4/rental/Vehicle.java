package rental;

public class Vehicle {
    private String vehicleNumber;
    private String model;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String model, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.model = model;
        this.rentalRate = rentalRate;
    }

    public double calculateRental(int days) {
        return rentalRate * days;
    }
}
