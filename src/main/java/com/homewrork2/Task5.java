package com.homewrork2;

public class Task5 {
    public static void main(String[] args) {
        int[] array = {1, 4, 8, 3, 5, 10, 3, 8, 3, 1, 5, 10, 3, 7, 6, 1, 7, 9, 2, 9};
        int number;
        int counter;
        int maxCounter = 0;
        int foundNumber = array[0];
        for (int value : array) {
            number = value;
            counter = 0;
            for (int i : array) {
                if (i == number)
                    counter++;
                if (maxCounter < counter) {
                    maxCounter = counter;
                    foundNumber = value;
                }
            }
        }
        System.out.println("number " + foundNumber + " repeats " + maxCounter + " times");
    }
}
