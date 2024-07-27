package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class D27NavigateMethods
{
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.navigate().to("https://www.google.co.in/");

        driver.findElement(By.linkText("Gmail")).click();

        System.out.println(driver.getWindowHandle());

        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
    }
}
