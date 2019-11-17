package com.homework1;

public class Task2 {
    public static void main(String[] args) {
        int number = getNumber();
        String output = comparison(number);
        System.out.println(output);
    }

    private static int getNumber() {
        return 1666;
    }

    private static String comparison(int getNumber) {
        if (getNumber < 1000) {
            return "The price is satisfactory!";
        } else {
            return "Overpriced!";
        }
    }

}
