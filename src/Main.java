

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        TimeX startTime1 = new TimeX(2024,5,14,5,0);
        TimeX endTime1 = new TimeX(2024,5,14,9,0);
        TimeX startTime2 = new TimeX(2024,5,14,6,30);
        TimeX endTime2 = new TimeX(2024,5,14,7,0);
        TimeX openTime =  new TimeX(7,0);
        TimeX closeTime =  new TimeX(13,0);

        System.out.println(isAvailable(startTime1,endTime1,openTime,closeTime));
    }

    private static boolean isAvailable(TimeX startTime, TimeX endTime,TimeX openTime,TimeX closeTime){
        return (openTime.beforeX(startTime) && endTime.beforeX(closeTime));
    }
    private static int compareTime(int hour1,int min1,int hour2, int min2){
    return 0;}
}