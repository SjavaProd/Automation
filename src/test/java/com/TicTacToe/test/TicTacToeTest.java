package com.TicTacToe.test;

import com.TicTacToe.Main;
import com.TicTacToe.Status;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TicTacToeTest {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("***Test is started***");
    }

    @Test
    public void invalidInput() {
        String input = "XOXO1OXOX";
        Main.validateInput(input);
    }

    @Test
    public void incorrectStatus() {
        String input = "O--------";
        Main.validateInput(input);
        if (!Main.validateInput(input)) {
            System.out.println(Status.FIRST.getStatusValue());
        } else {
            Main.getStatus(input);
        }
    }

    @Test
    public void nextTurnIsX() {
        String input = "XXXXOOOO-";
        Main.validateInput(input);
        if (!Main.validateInput(input)) {
            System.out.println(Status.FIRST.getStatusValue());
        } else if (input.contains("-")) {
            Main.getStatus(input);
        } else {
            Main.getCombination(input, Main.xOrO(input, Main.winningCombinationsIndexes()));
        }
    }

    @Test
    public void nextTurnIsO() {
        String input = "X--------";
        Main.validateInput(input);
        if (!Main.validateInput(input)) {
            System.out.println(Status.FIRST.getStatusValue());
        } else if (input.contains("-")) {
            Main.getStatus(input);
        } else {
            Main.getCombination(input, Main.xOrO(input, Main.winningCombinationsIndexes()));
        }
    }

    @Test
    public void winnerIsX() {
        String input = "XXXXOOOOX";
        Main.validateInput(input);
        if (!Main.validateInput(input)) {
            System.out.println(Status.FIRST.getStatusValue());
        } else if (input.contains("-")) {
            Main.getStatus(input);
        } else {
            Main.getCombination(input, Main.xOrO(input, Main.winningCombinationsIndexes()));
        }
    }

    @Test
    public void winnerIsO() {
        String input = "XXOXOXOOX";
        Main.validateInput(input);
        if (!Main.validateInput(input)) {
            System.out.println(Status.FIRST.getStatusValue());
        } else if (input.contains("-")) {
            Main.getStatus(input);
        } else {
            Main.getCombination(input, Main.xOrO(input, Main.winningCombinationsIndexes()));
        }
    }

    @Test
    public void draw() {
        String input = "XOXXXOOXO";
        Main.validateInput(input);
        if (!Main.validateInput(input)) {
            System.out.println(Status.FIRST.getStatusValue());
        } else if (input.contains("-")) {
            Main.getStatus(input);
        } else {
            Main.getCombination(input, Main.xOrO(input, Main.winningCombinationsIndexes()));
        }
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("***Test is finished***");
    }

}
