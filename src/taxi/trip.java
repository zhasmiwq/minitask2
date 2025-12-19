package taxi;
public class trip {
    passenger passenger;
    driver driver;
    Car car;
    boolean accepted = false;

    public trip(passenger passenger, driver driver, Car Car) {
        this.passenger = passenger;
        this.driver = driver;
        this.car = Car;
    }

    public void start() {
        if (!accepted) {
            System.out.println("Trip cannot start. Not accepted.");
            return;
        }
        System.out.println("Trip started.");
    }

    public void finish() {
        System.out.println("Trip finished.");
    }
}