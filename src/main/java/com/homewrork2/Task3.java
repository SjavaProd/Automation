package com.homewrork2;

public class Task3 {
    public static void main(String[] args) {
        int[] array1 = getFirstArray();
        int[] array2 = getModifiedArray(getFirstArray());
        System.out.println("Show max values: ");
        for (int value : array2) {
            System.out.print(value + " ");
        }
    }

    private static int[] getFirstArray() {
        return new int[]{60, 74, 42, 61, 777, 13, 38, 59, 93, 82, 150, 666};
    }

    private static int[] getModifiedArray(int[] array1) {
        int t;
        for (int a = 1; a < array1.length; a++) {
            for (int b = array1.length - 1; b >= a; b--) {
                if (array1[b - 1] > array1[b]) {
                    t = array1[b - 1];
                    array1[b - 1] = array1[b];
                    array1[b] = t;
                }
            }
        }
        System.out.println("Show modified array: ");
        for (int value : array1) {
            System.out.print(value + " ");
        }
        System.out.println();
        int i = 0;
        return new int[]{array1[array1.length-1], array1[array1.length-2]};
    }
}
