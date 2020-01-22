package com.TicTacToe;

public class GameScheme extends Main {

    public int getNumber(String input) {
        if (!validateInput(input)) {
            return 1;
        } else {
            if (!statusValidation(input) || (isOWin(input, 'O') && isXWin(input, 'X'))) {
                return 2;
            } else {
                if (isSomebodyWin(input, 'X')) {
                    return 4;
                } else if (isSomebodyWin(input, 'O')) {
                    return 5;
                } else {
                    if (isXContinue(input, 'X')) {
                        return 6;
                    } else if (isOContinue(input, 'O')) {
                        return 7;
                    } else {
                        return 3;
                    }
                }
            }
        }
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
