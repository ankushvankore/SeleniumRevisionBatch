package com.TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class D05AmazonAssignment
{
    WebDriver driver;

    @BeforeTest
    public void openBrowser()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterTest
    public void closeBrowser()
    {
        driver.close();
    }
    @BeforeMethod
    public void openAmazon()
    {
        driver.get("https://www.amazon.in");
        System.out.println("Amazon Title: " + driver.getTitle());
    }
    @AfterMethod
    public void printTitle()
    {
        System.out.println("Title: " + driver.getTitle());
    }

    @Test (priority = 1)
    public void clickSell()
    {
        driver.findElement(By.partialLinkText("Sell")).click();
    }
    @Test (priority = 2)
    public void clickBestSeller()
    {
        driver.findElement(By.partialLinkText("Best")).click();
    }
    @Test (priority = 3)
    public void clickMobiles()
    {
        driver.findElement(By.partialLinkText("Mobile")).click();
    }
    @Test (priority = 4)
    public void clickElectronics()
    {
        driver.findElement(By.partialLinkText("Electronics")).click();
    }
}
