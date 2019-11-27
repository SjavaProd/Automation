//Написать метод который принимает на себя строку и возвращает перевёрнутую

package com.homework3;

public class Task1 {
    public static void main(String[] args) {
        String firstString = getString();
        String revertedString = revertString(firstString);
        System.out.println("First string is:\n" + firstString);
        System.out.println("Modified string is:\n"+ revertedString);
    }

    public static String getString() {
        String input = "Get a modern feel  with a smudge-resistant only for $2.50, you can finish now";
        return input;
    }

    public static String revertString(String input) {
        char[] arrayOfChars = input.toCharArray();
        char t;
        for (int a = 1; a < arrayOfChars.length; a++) {
            for (int b = arrayOfChars.length - 1; b >= a; b--) {
                t = arrayOfChars[b - 1];
                arrayOfChars[b - 1] = arrayOfChars[b];
                arrayOfChars[b] = t;
            }
        }
        String newModifiedStr = new String(arrayOfChars);
        return newModifiedStr;
    }
}