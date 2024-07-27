package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D13LocateByRelativeXpath
{
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");

        driver.findElement(By.xpath("//form[@class=\"_9vtf\"]/div/div/input")).sendKeys("ankushvankore@gmail.com");
        driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("123456789");
        driver.findElement(By.xpath("//*[contains(text(), \"u_0_5_\")]")).click();
        ////button[text() = "Log in"]
        ////button[contains(text(),"Log")]
        System.out.println(driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[2]/div[2]")).getText());

        driver.close();
    }
}
