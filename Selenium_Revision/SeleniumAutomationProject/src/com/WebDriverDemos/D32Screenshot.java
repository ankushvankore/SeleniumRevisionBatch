package com.WebDriverDemos;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class D32Screenshot
{
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.navigate().to("https://jqueryui.com/");

        Actions act = new Actions(driver);

        driver.findElement(By.partialLinkText("Drop")).click();

        //driver.switchTo().frame(0);
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));

        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));

        act.dragAndDrop(source, target).perform();

        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(file, new File("D:\\AViIT\\Demos\\Selenium_Revision\\JQuery.jpeg"));

        driver.close();
    }
}
