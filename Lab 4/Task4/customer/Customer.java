package customer;

import rental.Car;
import rental.Bike;

public class Customer {
    public static void main(String[] args) {
        Car car = new Car("KA-01-1234", "Honda City", 1000);
        Bike bike = new Bike("KA-02-5678", "Yamaha FZ", 500);

        System.out.println("Car Rental for 3 days: $" + car.calculateRental(3));
        System.out.println("Bike Rental for 5 days: $" + bike.calculateRental(5));
    }
}
