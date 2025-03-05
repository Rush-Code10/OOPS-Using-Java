public class q3 {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
        car.drive_car();

        Bike bike = new Bike();
        bike.drive();
        bike.drive_bike();
    }
}

class Vehicle {
    void drive() {
        System.out.println("Driving a vehicle");
    }
}

class Car extends Vehicle {
    void drive_car() {
        System.out.println("Driving a car");
    }
}

class Bike extends Vehicle {
    void drive_bike() {
        System.out.println("Driving a bike");
    }
}
