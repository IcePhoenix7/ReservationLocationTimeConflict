public class Reservation {
    TimeX startTime,endTime;
    Location location;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Reservation(TimeX startTime, TimeX endTime, Location location) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.location = location;

    }

    public TimeX getStartTime() {
        return startTime;
    }

    public void setStartTime(TimeX startTime) {
        this.startTime = startTime;
    }

    public TimeX getEndTime() {
        return endTime;
    }

    public void setEndTime(TimeX endTime) {
        this.endTime = endTime;
    }
}
