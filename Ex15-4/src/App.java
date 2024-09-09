import java.text.SimpleDateFormat;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Date d = new Date();
        SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
        System.out.println("日付: " + f.format(d));
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        int day = c.get(Calendar.DAY_OF_MONTH);
        c.set(Calendar.DAY_OF_MONTH,day + 100);
        d = c.getTime();       
        System.out.println("今日から100日後の日付: " + f.format(d));
    }
}
