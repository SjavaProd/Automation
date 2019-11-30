/*
Написать метод который принимает в себя строку в которой есть double значение
*(например “Get a modern feel  with a smudge-resistant only for $2.50, you can finish now”)
достаёт из него числовое значение и возвращает как double. После чего этот дабл вызывается
из другого метода в котором он умножается на 4 и выводится в консоль вместе с текстом
 */

package com.homework3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2v2 {
    public static void main(String[] args) {
        String sentence = getSentence();
        double price = getPrice(sentence);
        double newPrice = calculate(price);
        System.out.println("Value of our price is: " + price);
        System.out.println("String with new price is:\n" + sentence.replaceAll(("\\d.+\\d"), String.valueOf(newPrice)));
    }

    public static String getSentence() {
        String input = "Get a modern feel  with a smudge-resistant 2.50 only for you can finish now";
        return input;
    }

    public static double getPrice(String input) {
        Pattern pattern = Pattern.compile("\\d.+\\d");
        Matcher matcher = pattern.matcher(input);
        double price = 0;
        while (matcher.find()) {
            price = Double.parseDouble(input.substring(matcher.start(), matcher.end()));
        }
        return price;
    }

    public static double calculate(double price) {
        double newPrice = price * 4;
        return newPrice;
    }

}

