package com.TicTacToe.test;

import com.TicTacToe.Main;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TicTacToeTest {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("***Test is started***");
    }

    @Test
    public void addTest(){

        Main testExecution = new Main();
        //getting string from the main method
        String testInput = testExecution.getString();

        //validation
        boolean testValidation = testExecution.validateInput(testInput);
        if (testValidation==true){
            System.out.println("Validation is passed");
        } else {
            System.out.println("Неправильный ввод");
        }

        //getting status of the game process
        boolean testStatus = testExecution.getStatus(testInput);
        if (testStatus==true){
            System.out.println("Correct status");
        } else {
            System.out.println("Правильный ввод, некорректный статус");
        }

        //getting final result
        if (testInput.contains("-")){
            boolean testNextTurn = testExecution.getNextTurn(testInput);
            if (testNextTurn==true){
                System.out.println("Корректный статус. Игра продолжается - крестики ходят");
            } else {
                System.out.println("Корректный статус. Игра продолжается - нолики ходят");
            }
        } else {
            boolean testCombination = testExecution.getCombination(testInput);
            if (testCombination==true){
                System.out.println("Корректный статус. Игра закончена");
            } else {
                System.out.println("Корректный статус. Игра закончена - ничья");
            }
        }

    }

    @AfterClass
    public static void afterClass(){
        System.out.println("***Test is finished***");
    }

}
