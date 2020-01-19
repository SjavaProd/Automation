package com.TicTacToe;

public class GameScheme extends Main{
    
    public int getNumber(String input){
        if (!validateInput(input)) {
            return 1;
        } else if (input.contains("-")) {
            if (getStatus(input) == 2) {
                return 2;
            } else if (getStatus(input) == 6) {
                return 6;
            } else if (getStatus(input) == 7) {
                return 7;
            }
        } else {
            xOrO(input, winningCombinationsIndexes());
            getCombination(input, xOrO(input, winningCombinationsIndexes()));
            if (getCombination(input, xOrO(input, winningCombinationsIndexes())) == 4) {
                return 4;
            } else if (getCombination(input, xOrO(input, winningCombinationsIndexes())) == 5) {
                return 5;
            }
        }
        return 3;
    }

    public String setStatus(String input) {
        switch (getNumber(input)) {
            case 1:
                return Status.FIRST.getStatusValue();
            case 2:
                return Status.SECOND.getStatusValue();
            case 3:
                return Status.THIRD.getStatusValue();
            case 4:
                return Status.FOURTH.getStatusValue();
            case 5:
                return Status.FIFTH.getStatusValue();
            case 6:
                return Status.SIXTH.getStatusValue();
            case 7:
                return Status.SEVENTH.getStatusValue();
            default:
                return null;
        }
    }
}
