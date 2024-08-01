package com.TestNGDemo;

import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

public class D14OHRM_DataDrivenTesting
{
    File file;
    FileInputStream fis;
    FileOutputStream fos;
    XSSFWorkbook wb;
    XSSFSheet sheet;
    XSSFRow row;
    XSSFCell cell;
    int index = 1;
    XSSFCellStyle style;
    XSSFFont font;

    WebDriver driver;

    @BeforeTest
    public void configure() throws IOException {
        file = new File("LoginData.xlsx");
        fis = new FileInputStream(file);
        wb = new XSSFWorkbook(fis);
        sheet = wb.getSheet("LoginData");
        fos = new FileOutputStream(file);

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @DataProvider
    public Object[][] getLoginData()
    {
        int rows = sheet.getPhysicalNumberOfRows();
        String[][] loginData = new String[rows - 1][2];

        for(int i = 0; i < rows-1; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                loginData[i][j] = sheet.getRow(i+1).getCell(j).getStringCellValue();
            }
        }

        return loginData;
    }

    @Test(dataProvider = "getLoginData")
    public void loginToOHRM(String un, String ps)
    {
        driver.findElement(By.name("username")).sendKeys(un);
        driver.findElement(By.name("password")).sendKeys(ps);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "Invalid credentials");
    }

    @AfterMethod
    public void logout()
    {
        style = wb.createCellStyle();
        font = wb.createFont();

        cell = sheet.getRow(index).getCell(2);
        //if(driver.getCurrentUrl().contains("dashboard")) {
        if(driver.getPageSource().contains("Dashboard")){
            System.out.println("Test Case Pass");
            driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
            driver.findElement(By.partialLinkText("Log")).click();

            font.setColor(HSSFColor.HSSFColorPredefined.GREEN.getIndex());
            font.setBold(true);

            style.setFont(font);
            cell.setCellStyle(style);
            cell.setCellValue("Pass");
        }
        else {
            System.out.println("Invalid credentials");

            font.setColor(HSSFColor.HSSFColorPredefined.RED.getIndex());
            font.setItalic(true);

            style.setFont(font);
            cell.setCellStyle(style);

            cell.setCellValue("Fail");
        }
        index++;
    }

    @AfterTest
    public void tearDown() throws IOException {
        wb.write(fos);

        wb.close();
        fis.close();
        fos.close();

        driver.close();
    }
}
