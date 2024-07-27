package com.WebDriverDemos;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


public class D25HeadlessBrowser
{
    public static void main(String[] args) throws IOException {
        ChromeOptions op = new ChromeOptions();
        op.addArguments("--headless");
        WebDriver driver = new ChromeDriver(op);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demoqa.com/alerts");
        System.out.println("Title: " + driver.getTitle());

        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        org.openqa.selenium.io.FileHandler.copy(file, new File("D:\\MyFile.jpeg"));

        driver.close();
    }
}
