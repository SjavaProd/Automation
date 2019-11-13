package com.homewrork2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
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
                t = array[b - 1];
                array[b - 1] = array[b];
                array[b] = t;
            }
        }
        System.out.println();
        System.out.println("Show modified array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
