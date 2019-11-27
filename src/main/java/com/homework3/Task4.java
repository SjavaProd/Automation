/*
Написать метод который принимает в себя строку в которой есть два double   значения *
(например “Get a modern feel  with a smudge-resistant only for $4.50 $2.50, you can finish now”)
и достаёт из него последнее числовое значение и возвращает как double
 */


package com.homework3;

public class Task4 {
    public static void main(String[] args) {
        String sentence = getSentence();
        double price = getPrice(sentence);
        String firstStr = sentence.substring(0, (sentence.indexOf('$') + 1));
        String secondStr = sentence.substring(sentence.lastIndexOf(','));
        System.out.println("Required double is: " + price);
        System.out.println("New string is:\n" + firstStr + price + secondStr);
    }

    public static String getSentence() {
        String input = "Get a modern feel with a smudge-resistant only for $4.50 $2.50, you can finish now";
        return input;
    }

    private static double getPrice(String sentence) {
        int indexOfPrice1 = sentence.lastIndexOf('$') + 1;
        int indexOfPrice2 = sentence.lastIndexOf(',');
        double price = Double.valueOf(sentence.substring(indexOfPrice1, indexOfPrice2));
        return price;
    }

}
