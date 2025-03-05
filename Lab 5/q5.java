public class q5 {
    public static void main(String[] args) {
        PassengerFlight passengerFlight = new PassengerFlight();
        passengerFlight.fly();

        CargoFlight cargoFlight = new CargoFlight();
        cargoFlight.fly();
    }
}

class Flight {
    void fly() {
        System.out.println("Flight is flying");
    }
}

class PassengerFlight extends Flight {
    @Override
    void fly() {
        System.out.println("Passenger flight is flying");
    }
}

class CargoFlight extends Flight {
    @Override
    void fly() {
        System.out.println("Cargo flight is flying");
    }
}