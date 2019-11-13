package com.homewrork2;

public class Task4 {
    public static void main(String[] args) {
        int[] array = {60, 99, 74, 42, 61, 13, 38, 59, 93, 82};
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] % 3 != 0)
                counter++;
        }
        System.out.println(counter);
    }
}
