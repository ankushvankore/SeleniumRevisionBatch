package com.TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class D05AmazonAssignment
{
    WebDriver driver;

    @BeforeTest (alwaysRun = true)
    public void openBrowser()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterTest(alwaysRun = true)
    public void closeBrowser()
    {
        driver.close();
    }
    @BeforeMethod(alwaysRun = true)
    public void openAmazon()
    {
        driver.get("https://www.amazon.in");
        System.out.println("Amazon Title: " + driver.getTitle());
    }
    @AfterMethod(alwaysRun = true)
    public void printTitle()
    {
        System.out.println("Title: " + driver.getTitle());
    }

    @Test (priority = 1, groups = "sell")
    public void clickSell()
    {
        driver.findElement(By.partialLinkText("Sell")).click();
    }
    @Test (priority = 2, groups = "sell")
    public void clickBestSeller()
    {
        driver.findElement(By.partialLinkText("Best")).click();
    }
    @Test (priority = 3, groups = "gadgets")
    public void clickMobiles()
    {
        driver.findElement(By.partialLinkText("Mobile")).click();
    }
    @Test (priority = 4, groups = "gadgets")
    public void clickElectronics()
    {
        driver.findElement(By.partialLinkText("Electronics")).click();
    }
}
