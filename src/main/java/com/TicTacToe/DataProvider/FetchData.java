package com.TicTacToe.DataProvider;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FetchData {
    static Workbook book;
    static Sheet sheet;

    public static String TEST_DATA_SHEET_PATH = "src/main/java/com/TicTacToe/DataProvider/TestData.xlsx";

    public static Object [][] getDataFromSheet (String sheetName){
        FileInputStream file = null;
        try {
            file = new FileInputStream(TEST_DATA_SHEET_PATH);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        try {
            book = WorkbookFactory.create(file);
        } catch (InvalidFormatException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

        sheet = book.getSheet(sheetName);
        Object [][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
        for (int i = 0; i < sheet.getLastRowNum(); i++) {
            for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
                data[i][j] = sheet.getRow(i+1).getCell(j).toString();
            }
        }

        return data;
    }
}
