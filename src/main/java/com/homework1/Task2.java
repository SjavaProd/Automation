package com.homework1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //User`s input
        int price;

        //Validation
        do {
            System.out.println("Enter your price!");
            while (!input.hasNextInt()) {
                System.out.println("That not a price");
                input.next();
            }
            price = input.nextInt();
        } while (price <= 0);

        //Comparison and output to console
        if (price < 1000)
            System.out.println(price + " - The price is satisfactory!");
        else
            System.out.println(price + " - Overpriced!");
    }
}
