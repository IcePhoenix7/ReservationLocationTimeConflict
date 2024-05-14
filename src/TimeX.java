import java.util.Comparator;
import java.util.Date;

public class TimeX extends Date  {


    public TimeX(int year, int month, int date, int hrs, int min) {
        super(year, month, date, hrs, min);
    }
    public TimeX(int hrs, int min){
        super(120,1,0,hrs,min);
    }


    @Override
    public boolean after(Date date){
        int val;
        val = date.getMinutes() - super.getMinutes();
        if(val != 0)
            val = date.getHours() - super.getMinutes();
        return val <= 0;
    }
    public boolean beforeX(Date date){
        int val;
        val = date.getHours() - this.getHours();
        if(val == 0)
            val = date.getMinutes()-this.getMinutes();
        return val >= 0;
    }
}
