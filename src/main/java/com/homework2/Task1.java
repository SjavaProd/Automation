package com.homework2;

public class Task1 {
    public static void main(String[] args) {
        int[] array = getArray();
        int max = output(getArray());
        System.out.println("Max element of the array is: " + max);
    }

    private static int[] getArray() {
        return new int[]{-10, 6, -2, -1, 5, -1, 7, 6, -1, 6};
    }

    private static int output(int[] array) {
        int maxNumber = array[0];
        for (int value : array) {
            if (value > maxNumber) {
                maxNumber = value;
            }
        }
        return maxNumber;
    }
}
