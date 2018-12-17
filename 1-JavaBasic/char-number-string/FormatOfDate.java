import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by joongkeun.kim on 2017-07-26.
 */
public class FormatOfDate {
    public static void main(String[] args) {
        // January 1, 1970, 00:00:00 GMT.
        Date date = new Date();
        date.setTime(0000000000);

        // display time and date using toString()
        System.out.println(date.toString());

        System.out.printf("%1$s %2$tB %2$td, %2$tY \n", "Due date:", date);
        String str = String.format("change format of Date:%tc", date);
        System.out.println(str);

        //DateFormat
        System.out.println("short:\t"+ DateFormat.getDateInstance(DateFormat.SHORT).format(new Date()));
        System.out.println("medium:\t"+ DateFormat.getDateInstance(DateFormat.MEDIUM).format(new Date()));
        System.out.println("long:\t"+ DateFormat.getDateInstance(DateFormat.LONG).format(new Date()));
        System.out.println("full:\t"+ DateFormat.getDateInstance(DateFormat.FULL).format(new Date()));
        System.out.println("full:\t"+ DateFormat.getDateInstance(DateFormat.DAY_OF_WEEK_FIELD).format(new Date()));



        //GregorianCalendar
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(date);


    }
}
