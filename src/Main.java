

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    }

    private static boolean isOpen(TimeX startTime, TimeX endTime,TimeX openTime,TimeX closeTime){//give a better name
        return (openTime.beforeX(startTime) && endTime.beforeX(closeTime));
    }
    private static int isAvailable(TimeX startTime1, TimeX endTime1, TimeX startTime2, TimeX endTime2){



    return 0;}
}