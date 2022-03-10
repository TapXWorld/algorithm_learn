package org.example.learn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Test5 {

    public static void main(String[] args) throws Exception {
        Calendar calendar =  Calendar.getInstance();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse("2022-3-2");
        calendar.setTime(date);

        int x = calendar.get(Calendar.DAY_OF_WEEK);

        System.out.println(x);

        String s = "";
        if(x == 1) {
            s = "SUNDAY";
        }
        else if(x == 2) {
            s = "MONDAY";
        }
        else if(x == 3) {
            s = "TUESDAY";
        }
        else if(x == 4) {
            s = "WEDNESDAY";
        }
        else if(x == 5) {
            s = "THURSDAY";
        }
        else if(x == 6) {
            s = "FRIDAY";
        }
        else if(x == 7) {
            s = "SATURDAY";
        }
        System.out.println(s);
    }
}