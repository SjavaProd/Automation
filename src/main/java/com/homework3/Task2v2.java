package com.homework3;

public class Task2v2 {
    public static void main(String[] args) {
        String sentence = getSentence();
        double price = getPrice(sentence);
        double newPrice = calculate(price);
        String firstStr = sentence.substring(0, (sentence.indexOf('$') + 1));
        String secondStr = sentence.substring(sentence.indexOf(','));
        System.out.println("New string is:\n" + firstStr + newPrice + secondStr);
    }

    public static String getSentence() {
        String input = "Get a modern feel  with a smudge-resistant only for $2.50, you can finish now";
        return input;
    }

    public static double getPrice(String input) {
        int index1 = input.indexOf('$');
        int index2 = input.indexOf(',');
        double price = Double.valueOf(input.substring(index1 + 1, index2));
        return price;
    }

    public static double calculate(double price) {
        double newPrice = price * 4;
        return newPrice;
    }

}

