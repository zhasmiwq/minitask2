package taxi;
public class Main {
    public static void main(String[] args) {
// d
        passenger passenger = new passenger("Ali");
        driver driver = new driver("John");
        Car car = new Car("Toyota");

        Trip trip = passenger.requestTrip(driver, car);
        driver.acceptTrip(trip);

        trip.start();
        trip.finish();

        passenger.rateDriver(5);
    }
}