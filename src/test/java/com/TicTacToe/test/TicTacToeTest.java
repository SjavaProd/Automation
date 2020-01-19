package com.TicTacToe.test;

import com.TicTacToe.GameScheme;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TicTacToeTest extends GameScheme {

    final String INVALID_INPUT = "123";
    final String INCORRECT_STATUS = "-O-------";
    final String DRAW = "XOXXXOOXO";
    final String WINNER_IS_X = "XXXXOOOOX";
    final String WINNER_IS_O = "XXOXOXOXO";
    final String X_CONTINUES = "XXXXOOOO-";
    final String O_CONTINUES = "XXXXOOO--";

    @BeforeClass
    public static void beforeClass() {
        System.out.println("***Test is started***");
    }

    @Test
    public void getInvalidInput() {
        System.out.println(setStatus(INVALID_INPUT));
        Assert.assertEquals(1, getNumber(INVALID_INPUT));
    }

    @Test
    public void getIncorrectStatus() {
        System.out.println(setStatus(INCORRECT_STATUS));
        Assert.assertEquals(2, getNumber(INCORRECT_STATUS));
    }

    @Test
    public void getDraw() {
        System.out.println(setStatus(DRAW));
        Assert.assertEquals(3, getNumber(DRAW));
    }

    @Test
    public void getWinnerX() {
        System.out.println(setStatus(WINNER_IS_X));
        Assert.assertEquals(4, getNumber(WINNER_IS_X));
    }

    @Test
    public void getWinnerO() {
        System.out.println(setStatus(WINNER_IS_O));
        Assert.assertEquals(5, getNumber(WINNER_IS_O));
    }

    @Test
    public void getXContinues() {
        System.out.println(setStatus(X_CONTINUES));
        Assert.assertEquals(6, getNumber(X_CONTINUES));
    }

    @Test
    public void getOContinues() {
        System.out.println(setStatus(O_CONTINUES));
        Assert.assertEquals(7, getNumber(O_CONTINUES));
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("***Test is finished***");
    }

}
