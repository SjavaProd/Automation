package com.TicTacToe;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public boolean validateInput(String input) {
        Pattern pattern = Pattern.compile("^[XO-]{9}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }

    private int charCounter(String input, char xOrO){
        char[] arrayOfChars = input.toUpperCase().toCharArray();
        int counter = 0;
        for (int i = 0; i < arrayOfChars.length; i++) {
            if (arrayOfChars[i] == xOrO) {
                counter++;
            }
        }
        return counter;
    }

    private int xCount (String input){
        return charCounter(input, 'X');
    }

    private int oCount (String input){
        return charCounter(input, 'O');
    }

    public boolean statusValidation(String input) {
        int countX = xCount(input);
        int countO = oCount(input);
        if (countX > countO + 1 || countO > countX) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isSomebodyContinue(String input, char xOrO){
        int countX = xCount(input);
        int countO = oCount(input);
        if (countX == countO || countX > countO) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isXContinue (String input, char xOrO){
        return isSomebodyContinue(input, 'X');
    }

    public boolean isOContinue (String input, char xOrO){
        return isSomebodyContinue(input, 'O');
    }

    public int[][] winningCombinationsIndexes() {
        return new int[][]{{0, 1, 2}, {3, 4, 5}, {7, 6, 8}, {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, {0, 4, 8}, {2, 4, 6}};
    }

    public boolean isSomebodyWin(String input, char xOrO) {
        boolean winningCombination = false;
        for (int i = 0; i < winningCombinationsIndexes().length; i++) {
            winningCombination = input.charAt(winningCombinationsIndexes()[i][0]) == xOrO &
                    input.charAt(winningCombinationsIndexes()[i][1]) == xOrO &
                    input.charAt(winningCombinationsIndexes()[i][2]) == xOrO;
            if (winningCombination){
                break;
            }
        }
        return winningCombination;
    }

    public boolean isXWin (String input, char xOrO){
        return isSomebodyWin(input, 'X');
    }

    public boolean isOWin (String input, char xOrO){
        return isSomebodyWin(input, 'O');
    }

}
