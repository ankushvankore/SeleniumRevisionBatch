package com.TestNGDemo;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class D11WriteToExcel
{
    File file;
    FileOutputStream fos;
    XSSFWorkbook wb;
    XSSFSheet sheet;
    XSSFRow row;
    XSSFCell cell;

    @BeforeTest
    public void configure() throws FileNotFoundException {
        file = new File("MyFirstExcel.xlsx");
        fos = new FileOutputStream(file);
        wb = new XSSFWorkbook();
        sheet = wb.createSheet("MySheet");
    }

    @Test
    public void writeData()
    {
        row = sheet.createRow(0);   //Creates 1st row
        cell = row.createCell(0); //Creates 1st cell in 1st row

        cell.setCellValue("Vaishali");
    }

    @AfterTest
    public void tearDown() throws IOException {
        wb.write(fos);      //Write the data to Excel sheet
        wb.close();
        fos.close();
    }
}
