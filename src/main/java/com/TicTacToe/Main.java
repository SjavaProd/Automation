package com.TicTacToe;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String input = getInput();
        boolean validation = validateInput(input);
        if (validation == true && input.contains("-")) {
            boolean status = getStatus(input);
        } else {
            boolean winningCombination = getCombination(input);
        }
    }

    public static String getInput() {
        String input = "XOXOXOXOX";
        return input;
    }

    public static boolean validateInput(String input) {
        Pattern pattern = Pattern.compile("[XO-]{9}+", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            return true;
        } else {
            System.out.println(Status.FIRST.getStatusValue());
            return false;
        }
    }

    public static boolean getStatus(String input) {
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
            System.out.println(Status.SECOND.getStatusValue());
            return false;
        } else if (countX == countO) {
            System.out.println(Status.SIXTH.getStatusValue());
            return true;
        } else {
            System.out.println(Status.SEVENTH.getStatusValue());
            return true;
        }
    }

    public static boolean getCombination(String input) {
        if (input.charAt(0)=='X'&&input.charAt(1)=='X'&&input.charAt(2)=='X')
            System.out.println(Status.FOURTH.getStatusValue());
        return true;
    }

}
