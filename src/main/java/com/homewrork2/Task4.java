package com.homewrork2;

public class Task4 {
    public static void main(String[] args) {
        int counter = getCounter();
        System.out.println(counter);
    }

    private static int getCounter() {
        int[] array = {92, 90, 66, 57, 88, 79, 3, 84, 39, 94, 69, 15, 14, 43, 78, 76, 13, 12, 64, 11};
        int counter = 0;
        for (int value : array) {
            if (value % 2 == 0 && value % 3 != 0)
                counter++;
        }
        return counter;
    }
}
