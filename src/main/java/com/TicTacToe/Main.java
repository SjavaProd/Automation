package com.TicTacToe;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String input = getString();
        boolean validation = validateInput(input);
        boolean status = getStatus(input);
        if (input.contains("-")) {
            boolean nextTurn = getNextTurn(input);
        } else {
            boolean combination = getCombination(input);
        }
    }

    private static String getString() {
        String input = "XXXOOXXOO";
        return input;
    }

    private static boolean validateInput(String input) {
        Pattern pattern = Pattern.compile("[XO-]{9}+", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            return true;
        } else {
            System.out.println("Неправильный ввод");
            return false;
        }
    }

    private static boolean getStatus(String input) {
        char[] arrayOfChars = input.toUpperCase().toCharArray();
        int countX = 0;
        int countO = 0;
        for (int i = 0; i < arrayOfChars.length; i++) {
            if (arrayOfChars[i] == 'X') {
                countX++;
            } else if (arrayOfChars[i] == 'O') {
                countO++;
            }
        }
        if (countX > countO + 1 || countO > countX + 1) {
            System.out.println("Правильный ввод, некорректный статус");
            return false;
        } else {
            return true;
        }
    }

    private static boolean getNextTurn(String input) {
        char[] arrayOfChars = input.toUpperCase().toCharArray();
        int countX = 0;
        int countO = 0;
        for (int i = 0; i < arrayOfChars.length; i++) {
            if (arrayOfChars[i] == 'X') {
                countX++;
            } else if (arrayOfChars[i] == 'O') {
                countO++;
            }
        }
        if (countX==countO){
            System.out.println("Корректный статус. Игра продолжается - крестики ходят");
            return true;
        } else {
            System.out.println("Корректный статус. Игра продолжается - нолики ходят");
            return false;
        }
    }

    private static boolean getCombination(String input) {
        Pattern pattern1 = Pattern.compile("^[X]{3}+\\D{6}$||^\\D{3}+[X]{3}+\\D{3}$||^\\D{6}+[X]$+" +
                "^[X]+\\w{2}+[X]+\\w{2}+[X]+\\w{2}$||^\\w+[X]+\\w{2}+[X]+\\w{2}+[X]+\\w$||^\\w{2}+[X]+\\w{2}+[X]+\\{2}+[X]$+" +
                "^[X]+\\w{3}+[X]+\\w{3}+[X]$||^\\w{2}+[X]+\\w+[X]+\\w{3}+[X]$", Pattern.CASE_INSENSITIVE);
        Pattern pattern2 = Pattern.compile("^[O]{3}+\\D{6}$||^\\D{3}+[O]{3}+\\D{3}$||^\\D{6}+[O]$+" +
                "^[O]+\\w{2}+[O]+\\w{2}+[O]+\\w{2}$||^\\w+[O]+\\w{2}+[O]+\\w{2}+[O]+\\w$||^\\w{2}+[O]+\\w{2}+[O]+\\{2}+[O]$+" +
                "^[O]+\\w{3}+[O]+\\w{3}+[O]$||^\\w{2}+[O]+\\w+[O]+\\w{3}+[O]$", Pattern.CASE_INSENSITIVE);
        Matcher matcher1 = pattern1.matcher(input);
        Matcher matcher2 = pattern2.matcher(input);
        if (matcher1.matches()) {
            System.out.println("Корректный статус. Игра закончена - крестики выиграли");
            return true;
        } else if (matcher2.matches()) {
            System.out.println("Корректный статус. Игра закончена - нолики выиграли");
            return true;
        } else {
            System.out.println("Корректный статус. Игра закончена - ничья");
            return false;
        }
    }
}
