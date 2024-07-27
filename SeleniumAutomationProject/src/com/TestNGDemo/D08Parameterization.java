package com.TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class D08Parameterization
{
    WebDriver driver;

    @BeforeTest
    public void openBrowser()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demoqa.com/webtables");
    }

    @AfterTest
    public void closeBrowser()
    {
        //driver.close();
    }
    @Parameters({"fName", "lName", "eMail", "age", "salary", "department"})
    @Test
    public void addRow(String fName, String lName, String eMail, String age, String salary, String dept)
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", driver.findElement(By.id("addNewRecordButton")));

        driver.findElement(By.id("firstName")).sendKeys(fName);
        driver.findElement(By.id("lastName")).sendKeys(lName);
        driver.findElement(By.id("userEmail")).sendKeys(eMail);
        driver.findElement(By.id("age")).sendKeys(age);
        driver.findElement(By.id("salary")).sendKeys(salary);
        driver.findElement(By.id("department")).sendKeys(dept);
        driver.findElement(By.id("submit")).sendKeys(Keys.ENTER);
    }
}
