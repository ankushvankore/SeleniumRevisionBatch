package com.TestNGDemo;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.*;

public class D13ReadFromExcel
{
    File file;
    FileInputStream fis;
    XSSFWorkbook wb;
    XSSFSheet sheet;
    XSSFRow row;
    XSSFCell cell;

    @BeforeTest
    public void configure() throws IOException {
        file = new File("LoginData.xlsx");
        fis = new FileInputStream(file);
        wb = new XSSFWorkbook(fis);
        sheet = wb.getSheet("LoginData");
    }

    @Test
    public void readData()
    {
        /*row = sheet.getRow(0);
        cell = row.getCell(0);
        System.out.println(cell.getStringCellValue());

        cell = row.getCell(1);
        System.out.println(cell.getStringCellValue());

        cell = row.getCell(2);
        System.out.println(cell.getStringCellValue());

         */
        /*
        System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
        System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
        System.out.println(sheet.getRow(0).getCell(2).getStringCellValue());

        System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
        System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
        System.out.println(sheet.getRow(1).getCell(2).getStringCellValue());
         */

        /*
        for(int i = 0; i < 5; i++)
        {
            row = sheet.getRow(i);
            for(int j = 0; j < 3; j++)
            {
                cell = row.getCell(j);
                System.out.print(cell.getStringCellValue() + "\t");
            }
            System.out.println();
        }
        */

        int rows = sheet.getPhysicalNumberOfRows();
        int cells = sheet.getRow(0).getPhysicalNumberOfCells();

        for(int i = 0; i < rows; i++)
        {
            cells = sheet.getRow(i).getPhysicalNumberOfCells();
            for(int j = 0; j < cells; j++)
            {
                System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() + "\t");
            }
            System.out.println();
        }

    }

    @AfterTest
    public void tearDown() throws IOException {
        wb.close();
        fis.close();
    }
}
