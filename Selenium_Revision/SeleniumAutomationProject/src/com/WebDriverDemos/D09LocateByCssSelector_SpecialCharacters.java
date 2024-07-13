package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D09LocateByCssSelector_SpecialCharacters
{
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");

        //WebElement userName = driver.findElement(By.cssSelector("input[placeholder*=\"address\"]"));
        WebElement userName = driver.findElement(By.cssSelector("#email"));
        userName.sendKeys("ankushvankore@gmail.com");
        //WebElement password = driver.findElement(By.cssSelector("input[class$=\"_9npi\"]"));
        WebElement password = driver.findElement(By.cssSelector("._9npi"));
        password.sendKeys("1234567890");
        WebElement loginBtn = driver.findElement(By.cssSelector("button[id^=\"u_0_5_\"]"));
        //loginBtn.sendKeys(Keys.ENTER);
        loginBtn.sendKeys(Keys.SPACE);

        WebElement errorMsg = driver.findElement(By.cssSelector("div[class=\"fsl fwb fcb\"]"));
        String msg = errorMsg.getText();
        System.out.println("Error Message: " + msg);

        driver.close();
    }
}
