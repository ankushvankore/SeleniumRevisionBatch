package com.WebDriverDemos;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class D24HandlingAlert
{
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demoqa.com/alerts");

        Alert alt;
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //js.executeScript("window.scrollBy(0, 200)", "");
        js.executeScript("arguments[0].click()", driver.findElement(By.id("alertButton")));
        //driver.findElement(By.id("alertButton")).click();
        alt = driver.switchTo().alert();
        System.out.println(alt.getText());
        alt.accept();

        //driver.close();
    }
}
