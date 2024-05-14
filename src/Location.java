import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Location {
    public Location(String timeInterval, String building) {
        this.building = building;
    }

    private String openTime;
    private String closeTime;
    private String[][] availabilityTable = {
            {"no", "00:00", "01:29"}, {"no", "01:30", "02:59"}, {"no", "03:00", "04:29"}, {"no", "04:30", "05:59"},
            {"no", "06:00", "07:29"}, {"no", "07:30", "08:59"}, {"no", "09:00", "10:29"}, {"no", "10:30", "11:59"},
            {"no", "12:00", "13:29"}, {"no", "13:30", "14:59"}, {"no", "15:00", "16:29"}, {"no", "16:30", "17:59"},
            {"no", "18:00", "19:29"}, {"no", "19:30", "20:59"}, {"no", "21:00", "22:29"}, {"no", "22:30", "23:59"}
    };
    public void setOpenTimeBySecNum(int start,int end){
        for(int i = start;i==end+1;i++){
            availabilityTable[i][0] = "yes";
        }
    }
    public void setOpenTimeBySecNum(String start,String end){

    }
    public void reserve(int num){
        availabilityTable[num][0]="yes";
    }














    public String[][] getAvailabilityTable() {
        return availabilityTable;
    }

    String building;


    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    public String getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime;
    }

    public void setAvailabilityTable(String[][] availabilityTable) {
        this.availabilityTable = availabilityTable;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }
}
