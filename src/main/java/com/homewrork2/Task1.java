package com.homewrork2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("How many elements do you want in your array? Enter the number, please: ");
        Scanner elementsNumber = new Scanner(System.in);
        int i = elementsNumber.nextInt();
        int[] array = new int[i];
        int max = 0;
        for (i = 0; i < array.length; i++) {
            System.out.println("Enter " + i + " element of the array: ");
            Scanner elements = new Scanner(System.in);
            int elementOfArray = elements.nextInt();
            array[i]=elementOfArray;
            if (array[i]>max)
                max = array[i];
        }
        System.out.println(max);
    }
}
