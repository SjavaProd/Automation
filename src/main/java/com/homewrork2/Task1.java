package com.homewrork2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] array = getArray();
        int max = output(getArray());
        System.out.println("Max element of the array is: " + max);
    }

    private static int[] getArray() {
        return new int[]{60, 74, 42, 61, 13, 38, 59, 93, 82};
    }

    private static int output(int[] array) {
        int maxNumber = 0;
        for (int value : array) {
            if (value > maxNumber) {
                maxNumber = value;
            }
        }
        return maxNumber;
    }
}
