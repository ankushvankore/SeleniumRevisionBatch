package com.TestNGDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class D10PageObjectModel
{
    WebDriver driver;
    TricentisClass t1;

    @BeforeTest
    public void openBrowser() throws IOException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://sampleapp.tricentis.com/101/index.php#");

        t1 = new TricentisClass(driver);
    }

    @AfterTest
    public void closeBrowser()
    {
        driver.close();
    }

    @Test
    public void automobileTest()
    {
        t1.clickAutomobile();
        t1.selectMake("Audi");
        t1.setEnginePerformance("1000");
        t1.setDateOfManufacture("07/28/2024");
        t1.selectNoOfSeats("2");
    }
    @Test
    public void truckTest()
    {
        t1.clickTruck();
        t1.selectMake("BMW");
        t1.setEnginePerformance("1000");
        t1.setDateOfManufacture("07/28/2024");
        t1.selectNoOfSeats("2");
    }
}
