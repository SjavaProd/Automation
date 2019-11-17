package com.homework1;

enum Seasons {
    WINTER,
    SPRING,
    SUMMER,
    AUTUMN
}

public class Task1 {
    public static void main(String[] args) {
        String text = getText();
        String message = getMessage(text);
        System.out.println("The following message for " + text + " season is: " + message);
    }

    private static String getText() {
        return "summer".toUpperCase();
    }

    private static String getMessage(String input) {
        Seasons seasons = Seasons.valueOf(input);
        switch (seasons) {
            case WINTER:
                return "It`s cold";
            case SPRING:
                return "It`s warm";
            case SUMMER:
                return "It`s hot";
            case AUTUMN:
                return "Winter is coming";
            default:
                return null;

        }
    }
}
