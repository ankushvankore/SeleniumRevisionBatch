package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class A04OHRM_Login_Logout
{
    WebDriver driver;

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
    @Test
    public void login1()
    {
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    @Test
    public void login2()
    {
        driver.findElement(By.name("username")).sendKeys("monu");
        driver.findElement(By.name("password")).sendKeys("monu123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    @Test
    public void login3()
    {
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    @Test
    public void login4()
    {
        driver.findElement(By.name("username")).sendKeys("sarvesh");
        driver.findElement(By.name("password")).sendKeys("sarvesh123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
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
