package com.TestNGDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class D04Before_After_Method
{
    WebDriver driver;
    @BeforeTest
    public void openBrowser()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        System.out.println("Before Test");
    }
    @AfterTest
    public void closeBrowser()
    {
        System.out.println("After Test");
        driver.close();
    }
    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("Before Method...");
    }
    @AfterMethod
    public void printTitle()
    {
        System.out.println("Title: " + driver.getTitle());
        System.out.println("After Method...");
    }
    @Test(priority = 1)
    public void openMeesho()
    {
        driver.get("https://www.meesho.com/");
    }
    @Test (priority = 4)
    public void openAmazon()
    {
        driver.get("https://www.amazon.in/");
    }
    @Test (priority = 2)
    public void openAjio()
    {
        driver.get("https://www.ajio.com/");
    }
    @Test (priority = 3)
    public void openMyntra()
    {
        driver.get("https://www.myntra.com/");
    }
}
