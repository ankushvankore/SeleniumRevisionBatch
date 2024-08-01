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

public class D12CreateStudentInfo
{
    File file;
    FileOutputStream fos;
    XSSFWorkbook wb;
    XSSFSheet sheet;
    XSSFRow row;
    XSSFCell cell;

    @BeforeTest
    public void configure() throws FileNotFoundException {
        file = new File("StudentInfo.xlsx");
        fos = new FileOutputStream(file);
        wb = new XSSFWorkbook();
        sheet = wb.createSheet("Info");
    }

    @Test
    public void createData()
    {
        row = sheet.createRow(0);
        cell = row.createCell(0);
        cell.setCellValue("Vaishali");

        cell = row.createCell(1);
        cell.setCellValue("Gurav");

        sheet.createRow(1).createCell(0).setCellValue("Monu");
        sheet.getRow(1).createCell(1).setCellValue("Suryavanshi");

        sheet.createRow(2).createCell(0).setCellValue("Ankush");
        sheet.getRow(2).createCell(1).setCellValue("Vankore");
    }

    @AfterTest
    public void tearDown() throws IOException {
        wb.write(fos);      //Write the data to Excel sheet
        wb.close();
        fos.close();
    }
}
