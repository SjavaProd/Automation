package com.homewrork2;

public class Task5 {
    public static void main(String[] args) {
        int[] array = {2, 5, 5, 4, 3, 2, 5, 2, 1, 2};
        int number;
        int counter;
        for (int i = 0; i < array.length; i++) {
            number = array[i];
            counter = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == number)
                    counter++;
            }
            System.out.println("number " + number + " repeats " + counter + " times");
        }
    }
}
