package com.homewrork2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int[] array1 = getFirstArray();
        int[] array2 = getModifiedArray(getFirstArray());
        System.out.println("Show first array: ");
        for (int value : array1) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println("Show modified array: ");
        for (int value : array2) {
            System.out.print(value + " ");
        }
    }

    private static int[] getFirstArray() {
        return new int[]{60, 74, 42, 61, 13, 38, 59, 93, 82};
    }

    private static int[] getModifiedArray(int[] array1) {
        int t;
        for (int a = 1; a < array1.length; a++) {
            for (int b = array1.length - 1; b >= a; b--) {
                t = array1[b - 1];
                array1[b - 1] = array1[b];
                array1[b] = t;
            }
        }
        return array1;
    }
}
