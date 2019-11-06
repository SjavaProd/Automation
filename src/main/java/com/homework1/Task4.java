package com.homework1;

import java.util.Scanner;

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
        try {
            System.out.println("Enter the current day of the week!");
            //User input
            Scanner scan = new Scanner(System.in);
            String userInput = scan.nextLine().toUpperCase();
            Days var1 = Days.valueOf(userInput);

            if (!var1.isWeekend())
                System.out.println(var1 + " - is a workday!");
            else
                System.out.println(var1 + " - is a weekend!");

        } catch (Exception e) {
            System.out.println("Something went wrong! Please try again");
        }
    }
}
