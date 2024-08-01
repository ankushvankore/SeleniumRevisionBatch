package com.TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class D09KeywordDrivenFramework
{
    WebDriver driver;
    File file;
    FileInputStream fis;
    Properties prop;

    @BeforeTest
    public void openBrowser() throws IOException {
        file = new File("D:\\AViIT\\Demos\\Selenium_Revision\\SeleniumAutomationProject\\src\\com\\TestNGDemo\\MyData.properties");
        fis = new FileInputStream(file);
        prop = new Properties();
        prop.load(fis);

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get(prop.getProperty("url"));
    }

    @AfterTest
    public void closeBrowser()
    {
        driver.close();
    }

    @Test
    public void login()
    {
        driver.findElement(By.id(prop.getProperty("userNametxtBoxId"))).sendKeys(prop.getProperty("userName"));
        driver.findElement(By.xpath(prop.getProperty("passwordTxtBoxXpath"))).sendKeys("Password123");
        driver.findElement(By.cssSelector(prop.getProperty("loginBtnCssSelector"))).click();
    }
    @AfterMethod
    public void logout()
    {
        driver.findElement(By.partialLinkText(prop.getProperty("logoutBtnLink"))).click();
    }

}
