package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class D30MouseClicks
{
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.navigate().to("https://demoqa.com/buttons");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        Actions act = new Actions(driver);

        js.executeScript("window.scrollBy(0, 250)", "");
        WebElement dblClick = driver.findElement(By.id("doubleClickBtn"));
        //act.moveToElement(dblClick).doubleClick().perform();
        act.doubleClick(dblClick).build().perform();
        System.out.println(driver.findElement(By.id("doubleClickMessage")).getText());

        WebElement rightClick = driver.findElement(By.id("rightClickBtn"));
        //act.moveToElement(rightClick).contextClick().perform();
        act.contextClick(rightClick).perform();
        System.out.println(driver.findElement(By.id("rightClickMessage")).getText());

        WebElement lClick = driver.findElement(By.xpath("//button[text()=\"Click Me\"]"));
        //act.moveToElement(lClick).click().perform();
        act.click(lClick).perform();
        System.out.println(driver.findElement(By.id("dynamicClickMessage")).getText());

        driver.close();
    }
}
