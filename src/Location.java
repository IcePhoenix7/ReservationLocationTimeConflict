import java.util.ArrayList;
import java.util.List;

public class Location {
    private TimeX openTime,closeTime;
    private List<Reservation> reservations = new ArrayList<>();//maybe change the type
    String building;

    public Location(TimeX openTime, TimeX closeTime, String building) {
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.building = building;
    }

    public TimeX getOpenTime() {
        return openTime;
    }

    public void setOpenTime(TimeX openTime) {
        this.openTime = openTime;
    }

    public TimeX getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(TimeX closeTime) {
        this.closeTime = closeTime;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }




}
