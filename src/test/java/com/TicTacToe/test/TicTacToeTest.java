package com.TicTacToe.test;

import com.TicTacToe.DataProvider.FetchData;
import com.TicTacToe.GameScheme;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TicTacToeTest extends GameScheme {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("***Test is started***");
    }

    @DataProvider
    public Object[][] getTestData(){
        Object data [][] = FetchData.getDataFromSheet("test1");
        return data;
    }

    @Test(dataProvider = "getTestData")
    public void ticTacToeTest (String input, String expectedResult){
        System.out.println(setStatus(input));
        Assert.assertEquals(expectedResult, setStatus(input));
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("***Test is finished***");
    }
}
