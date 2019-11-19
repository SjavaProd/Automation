package com.homewrork2;

public class Task3 {
    public static void main(String[] args) {
        int[] array = modifyAnArray();
        System.out.println("\nShow max values: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    private static int[] modifyAnArray() {
        int[] array = {60, 74, 42, 61, 777, 13, 38, 59, 93, 82, 150, 666};
        int t;
        for (int a = 1; a < array.length; a++) {
            for (int b = array.length - 1; b >= a; b--) {
                if (array[b - 1] > array[b]) {
                    t = array[b - 1];
                    array[b - 1] = array[b];
                    array[b] = t;
                }
            }
        }
        System.out.println("Show modified array: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        return new int[]{array[array.length - 1], array[array.length - 2]};
    }
}
