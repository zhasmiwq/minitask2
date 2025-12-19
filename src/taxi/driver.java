package taxi;
public class driver {
    String name;

    public driver(String name) {
        this.name = name;
    }

    public void acceptTrip(Trip trip) {
        trip.accepted = true;
        System.out.println("Driver accepted the trip.");
    }
}