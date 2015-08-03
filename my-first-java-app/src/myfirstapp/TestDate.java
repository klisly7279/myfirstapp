package myfirstapp;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by klisly on 8/1/15.
 */
public class TestDate {
    public  static void  main(String[] args){

        Date date = new Date();
        SimpleDateFormat ft =
                new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

        System.out.println(" current date :" + ft.format(date));

        System.out.println("=======================");
        System.out.println(date.toString());

        System.out.println(date.compareTo(new Date("Sat Aug 01 14:37:25 CST 2015")));

        System.out.println(date.getTime());

        System.out.println(date.before(date));
        System.out.println(date.after(date));
        System.out.println(date.equals(date));




    }


}
