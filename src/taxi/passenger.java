package taxi;
public class passenger {
    String name;

    public passenger(String name) {
        this.name = name;
    }

    public Trip requestTrip(driver driver, Car car) {
        System.out.println("Passenger requested a trip.");
        return new Trip(this, driver, car);
    }

    public void rateDriver(int rating) {
        if (rating >= 1 && rating <= 5) {
            System.out.println("Driver rating: " + rating);
        } else {
            System.out.println("Rating must be from 1 to 5.");
        }
    }
}