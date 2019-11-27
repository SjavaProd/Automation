/*
Написать метод который принимает в себя 2 даты в формате yyyy-MM-dd'T'HH:mm:ss и возвращает разницу между ними в секундах
 */


package com.homework3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Task5 {
    public static void main(String[] args) {
        SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        Calendar cal1 = setFirstDate();
        Calendar cal2 = setSecondDate();
        long difference = getDif(cal1, cal2);
        System.out.println(formater.format(cal1.getTime()));
        System.out.println(formater.format(cal2.getTime()));
        System.out.println("Difference between our dates is " + difference + " seconds");
    }

    public static Calendar setFirstDate(){
        Calendar cal1 = new GregorianCalendar();
        cal1.set(1991, 9, 3, 12, 15, 55);
        return cal1;
    }

    public static Calendar setSecondDate(){
        Calendar cal2 = new GregorianCalendar();
        cal2.set(1991, 9, 4, 12, 15, 55);
        return cal2;
    }

    private static long getDif(Calendar cal1, Calendar cal2) {
        long difference = (cal1.getTimeInMillis()-cal2.getTimeInMillis())/1000;
        return Math.abs(difference);
    }

}
