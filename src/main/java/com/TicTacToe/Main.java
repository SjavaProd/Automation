package com.TicTacToe;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String input = getInput();
        boolean validation = validateInput(input);
        if (validation && input.contains("-")) {
            boolean status = getStatus(input);
        } else if (validation) {
            int[][] arrayOfTheWinner = winningCombinationsIndexes();
            char winChar = xOrO(input, arrayOfTheWinner);
            boolean winningCombination = getCombination(input, winChar);
        }
    }

    public static String getInput() {
        String input = "XXOXOXOOX";
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

        if (countX > countO + 1 || countO > countX) {
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

    public static int[][] winningCombinationsIndexes() {
        return new int[][]{{0, 1, 2}, {3, 4, 5}, {7, 6, 8}, {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, {0, 4, 8}, {2, 4, 6}};
    }

    public static char xOrO(String input, int[][] winningCombinationsIndexes) {
        char xOrO = 'X';
        for (int i = 0; i < winningCombinationsIndexes().length; i++) {
            if (input.charAt(winningCombinationsIndexes()[i][0]) == 'O' &
                    input.charAt(winningCombinationsIndexes()[i][1]) == 'O' &
                    input.charAt(winningCombinationsIndexes()[i][2]) == 'O') {
                return xOrO = 'O';
            }
        }
        return xOrO;
    }

    public static boolean getCombination(String input, char xOrO) {
        boolean winningCombination = false;
        for (int i = 0; i < winningCombinationsIndexes().length; i++) {
            winningCombination = input.charAt(winningCombinationsIndexes()[i][0]) == xOrO &
                    input.charAt(winningCombinationsIndexes()[i][1]) == xOrO &
                    input.charAt(winningCombinationsIndexes()[i][2]) == xOrO;
            if (winningCombination){
                break;
            }
        }
        if (winningCombination & xOrO == 'X') {
            System.out.println(Status.FOURTH.getStatusValue());
        } else if (winningCombination & xOrO == 'O'){
            System.out.println(Status.FIFTH.getStatusValue());
        } else {
            System.out.println(Status.THIRD.getStatusValue());
        }

        String[][] game = new String[3][3];
        int charNumber = 0;
        for (int i = 0; i < game.length; i++) {
            for (int j = 0; j < game[0].length; j++) {
                game[i][j] = Character.toString(input.charAt(charNumber));
                System.out.print(" " + game[i][j] + " ");
                charNumber++;
            }
            System.out.println();
        }
        return winningCombination;
    }
}
