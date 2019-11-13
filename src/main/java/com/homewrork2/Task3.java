package com.homewrork2;

public class Task3 {
    public static void main(String[] args) {
        int[] array = {5, 8, 3, 1, 4, 2, 9, 7, 6, 10};
        int size = array.length;
        int a, b, t;
        //Show an existing array
        System.out.println("Show an existing array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        //Bubble sorting
        for (a = 1; a < size; a++) {
            for (b = size - 1; b >= a; b--) {
                if (array[b - 1] > array[b]) {
                    t = array[b - 1];
                    array[b - 1] = array[b];
                    array[b] = t;
                }
            }
        }
        System.out.println();
        System.out.println("Show modified array: ");
        for (int i = size-1; i > size - 3; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
