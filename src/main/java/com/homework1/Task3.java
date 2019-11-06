package com.homework1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //User`s input
        int fingers;

        //Validation
        do {
            System.out.println("Enter your finger`s number (1-10)!)))");
            while (!input.hasNextInt()) {
                System.out.println("That not a number");
                input.next();
            }
            fingers = input.nextInt();
        } while (fingers < 0 || fingers > 10);

        //Switch statement for console output
        switch (fingers) {
            case 1:
            case 10:
                System.out.println("Thumb");
                break;
            case 2:
            case 9:
                System.out.println("Fore finger");
                break;
            case 3:
            case 8:
                System.out.println("Middle finger");
                break;
            case 4:
            case 7:
                System.out.println("Ring finger");
                break;
            case 5:
            case 6:
                System.out.println("Little finger");
                break;
        }
    }
}
