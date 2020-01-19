package com.TicTacToe;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public String getInput() {
        String input = "XXOXOXOOX";
        return input;
    }

    public boolean validateInput(String input) {
        Pattern pattern = Pattern.compile("[XO-]{9}+", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }

    public int getStatus(String input) {
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
            return 2;
        } else if (countX == countO) {
            return 6;
        } else {
            return 7;
        }
    }

    public int[][] winningCombinationsIndexes() {
        return new int[][]{{0, 1, 2}, {3, 4, 5}, {7, 6, 8}, {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, {0, 4, 8}, {2, 4, 6}};
    }

    public char xOrO(String input, int[][] winningCombinationsIndexes) {
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

    public int getCombination(String input, char xOrO) {
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
            return 4;
        } else if (winningCombination & xOrO == 'O'){
            return 5;
        } else {
            return 3;
        }
    }
}
