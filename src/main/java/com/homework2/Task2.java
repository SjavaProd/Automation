package com.homework2;

public class Task2 {
    public static void main(String[] args) {
        int[] array = getModifiedArray();
        System.out.println("\nShow modified array: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    private static int[] getModifiedArray() {
        int[] array = {60, 74, 42, 61, 13, 38, 59, 93, 82};
        int t;
        System.out.println("Show first array: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        for (int a = 1; a < array.length; a++) {
            for (int b = array.length - 1; b >= a; b--) {
                t = array[b - 1];
                array[b - 1] = array[b];
                array[b] = t;
            }
        }
        return array;
    }
}
