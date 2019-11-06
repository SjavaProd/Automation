package com.homework1;

import java.util.Scanner;

enum Seasons {
    WINTER,
    SPRING,
    SUMMER,
    FALL
}

public class Task1 {
    public static void main(String[] args) {
        //Implementation using try...catch blocks
        try {
            System.out.println("Enter the current season: ");
            //User input
            Scanner scan = new Scanner(System.in);
            String userInput = scan.nextLine().toUpperCase();
            Seasons var1 = Seasons.valueOf(userInput);
            //Switch statement for console output
            switch (var1) {
                case WINTER:
                    System.out.println("It`s COLD");
                    break;
                case SPRING:
                    System.out.println("It`s WARM");
                    break;
                case SUMMER:
                    System.out.println("It`s HOT");
                    break;
                case FALL:
                    System.out.println("Winter is coming");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Something went wrong! Please try again");
        }
    }
}
