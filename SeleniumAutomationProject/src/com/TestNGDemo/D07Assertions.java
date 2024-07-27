package com.TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class D07Assertions
{
    WebDriver driver;
    String expUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index", actUrl;

    @BeforeTest
    public void openBrowser()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @AfterTest
    public void closeBrowser()
    {
        driver.close();
    }
    @Test(dataProvider = "getLoginData")
    public void login(String un, String ps)
    {
        driver.findElement(By.name("username")).sendKeys(un);
        driver.findElement(By.name("password")).sendKeys(ps);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        actUrl = driver.getCurrentUrl();
        //Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "Invalid credentials");
        Assert.assertEquals(expUrl, actUrl,"Invalid credentials");
    }

    @DataProvider
    public Object[][]getLoginData()
    {
        String[][]loginData = new String[][]
                {
                        {"admin", "admin123"},
                        {"monu", "monu123"},
                        {"admin", "admin123"},
                        {"sarvesh", "sarvesh123"},
                };
        return loginData;
    }

    @AfterMethod
    public void logout()
    {
        //if(driver.getCurrentUrl().contains("dashboard")) {
        if(driver.getPageSource().contains("Dashboard")){
            System.out.println("Test Case Pass");
            driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
            driver.findElement(By.partialLinkText("Log")).click();
        }
        else {
            System.out.println("Invalid credentials");
        }
    }
}
