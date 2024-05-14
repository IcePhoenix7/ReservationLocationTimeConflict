public class Reservation {
    String timeInterval;
    Location location;

    public Reservation(String timeInterval, Location location) {
        this.timeInterval = timeInterval;
        this.location = location;
    }

    public String getTimeInterval() {
        return timeInterval;
    }

    public void setTimeInterval(String timeInterval) {
        this.timeInterval = timeInterval;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
