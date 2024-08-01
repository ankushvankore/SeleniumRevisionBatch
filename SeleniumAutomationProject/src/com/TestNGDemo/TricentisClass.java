package com.TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class TricentisClass
{
    @FindBy(id="make") WebElement vmake;
    @FindBy(id="engineperformance") WebElement wenginePerformance;


    WebDriver driver;

    public TricentisClass(WebDriver d)
    {
        this.driver = d;
        PageFactory.initElements(driver, this);
    }

    public static void main(String[] args) {
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        driver.get("https://sampleapp.tricentis.com/101/index.php");

//        TricentisClass t1 = new TricentisClass();
//        t1.clickAutomobile();
//        t1.selectMake("Audi");
//        t1.setEnginePerformance("1000");
//        t1.setDateOfManufacture("07/28/2024");
//        t1.selectNoOfSeats("2");
    }

    public void clickAutomobile()
    {
        driver.findElement(By.partialLinkText("Auto")).click();
    }
    public void selectMake(String make)
    {
        //Select vMake = new Select(driver.findElement(By.id("make")));
        //vMake.selectByVisibleText(make);
        //new Select(driver.findElement(By.id("make"))).selectByVisibleText(make);
        new Select(vmake).selectByVisibleText(make);
    }
    public void setEnginePerformance(String enginePerformance)
    {
        //driver.findElement(By.id("engineperformance")).sendKeys(enginePerformance);
        wenginePerformance.sendKeys(enginePerformance);
    }
    public void setDateOfManufacture(String dt)
    {
        driver.findElement(By.id("dateofmanufacture")).sendKeys(dt);
    }
    public void selectNoOfSeats(String seats)
    {
        new Select(driver.findElement(By.id("numberofseats"))).selectByVisibleText(seats);
    }
    public void clickTruck()
    {
        driver.findElement(By.partialLinkText("Truck")).click();
    }
}
