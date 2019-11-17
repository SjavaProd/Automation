package com.homework1;

enum Days {
    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(true),
    SUNDAY(true);
    private boolean isWeekend;

    Days(final boolean isWeekend) {
        this.isWeekend = isWeekend;
    }

    public boolean isWeekend() {
        return isWeekend;
    }
}

public class Task4 {
    public static void main(String[] args) {
        String day = getDay();
        String dayOfTheWeek = getMessage(day);
        System.out.println("The current day of the week (" + day + ")" + dayOfTheWeek);
    }

    private static String getDay() {
        return "saturday".toUpperCase();
    }

    private static String getMessage(String getDay) {
        Days days = Days.valueOf(getDay);
        if (!days.isWeekend())
            return " - is a workday!";
        else
            return " - is a weekend!";
    }

}
