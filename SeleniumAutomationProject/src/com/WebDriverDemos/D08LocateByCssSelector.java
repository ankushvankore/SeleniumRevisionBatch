package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D08LocateByCssSelector
{
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");

        WebElement userName = driver.findElement(By.cssSelector("input[placeholder=\"Email address or phone number\"]"));
        userName.sendKeys("ankushvankore@gmail.com");
        WebElement password = driver.findElement(By.cssSelector("input[placeholder=\"Password\"][type=\"password\"]"));
        password.sendKeys("1234567890");
        WebElement loginBtn = driver.findElement(By.cssSelector("button[class=\"_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\"]"));
        //loginBtn.sendKeys(Keys.ENTER);
        loginBtn.sendKeys(Keys.SPACE);
    }
}
