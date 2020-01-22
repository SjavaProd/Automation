package com.TicTacToe.test;

import com.TicTacToe.GameScheme;
import com.TicTacToe.Status;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TicTacToeTest extends GameScheme {

    final String INVALID_INPUT = "123";
    final String INCORRECT_STATUS = "O--------";
    final String DRAW = "XOXXXOOXO";
    final String WINNER_IS_X = "XXXXOOOOX";
    final String WINNER_IS_O = "XXOXOXOXO";
    final String X_CONTINUES = "XO-------";
    final String O_CONTINUES = "XOX------";

    @BeforeClass
    public static void beforeClass() {
        System.out.println("***Test is started***");
    }

    @Test
    public void getInvalidInput() {
        System.out.println(setStatus(INVALID_INPUT));
        Assert.assertEquals(Status.FIRST.getStatusValue(), setStatus(INVALID_INPUT));
    }

    @Test
    public void getIncorrectStatus() {
        System.out.println(setStatus(INCORRECT_STATUS));
        Assert.assertEquals(Status.SECOND.getStatusValue(), setStatus(INCORRECT_STATUS));
    }

    @Test
    public void getDraw() {
        System.out.println(setStatus(DRAW));
        Assert.assertEquals(Status.THIRD.getStatusValue(), setStatus(DRAW));
    }

    @Test
    public void getWinnerX() {
        System.out.println(setStatus(WINNER_IS_X));
        Assert.assertEquals(Status.FOURTH.getStatusValue(), setStatus(WINNER_IS_X));
    }

    @Test
    public void getWinnerO() {
        System.out.println(setStatus(WINNER_IS_O));
        Assert.assertEquals(Status.FIFTH.getStatusValue(), setStatus(WINNER_IS_O));
    }

    @Test
    public void getXContinues() {
        System.out.println(setStatus(X_CONTINUES));
        Assert.assertEquals(Status.SIXTH.getStatusValue(), setStatus(X_CONTINUES));
    }

    @Test
    public void getOContinues() {
        System.out.println(setStatus(O_CONTINUES));
        Assert.assertEquals(Status.SEVENTH.getStatusValue(), setStatus(O_CONTINUES));
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("***Test is finished***");
    }

}
