package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class D20Synchronization_ImplicitWait
{
    public static void main(String[] args) {
        ChromeOptions op = new ChromeOptions();
        op.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(op);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.redbus.in/");

        //Source
        driver.findElement(By.id("src")).sendKeys("Kolh");
        driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div/div[1]/div/div[1]/ul/li[1]/div/text")).click();

        //Target
        driver.findElement(By.id("dest")).sendKeys("Pun");
        driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div/div[3]/div[1]/ul/li[1]/div/text")).click();

        //Calender
        driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/i")).click();
        //driver.findElement(By.xpath("//span[normalize-space()='31']")).click();
        driver.findElement(By.xpath("//span[text()=\"31\"]")).click();

        //Search Bus
        driver.findElement(By.id("search_button")).click();

        //Bus Name
        System.out.println(driver.findElement(By.xpath("//*[@id=\"15974011\"]/div/div[1]/div[1]/div[1]/div[1]")).getText());

        List<WebElement>allBuses = driver.findElements(By.xpath("/html/body/section/div[2]/div[4]/div/div[2]/div/div[2]/div[2]/div/ul/div/li/div/div[1]/div[1]/div[1]/div[1]"));

        for(WebElement b : allBuses)
            System.out.println(b.getText());

        //driver.close();
    }
}
