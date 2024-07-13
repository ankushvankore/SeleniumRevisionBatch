package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A01FacebookLogin {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");

        WebElement userName = driver.findElement(By.className("inputtext"));
        userName.sendKeys("ankushvankore@gmail.com");
        WebElement password = driver.findElement(By.className("_9npi"));
        password.sendKeys("12345");
        WebElement loginBtn = driver.findElement(By.className("_42ft"));
        loginBtn.click();

        WebElement errorMsg = driver.findElement(By.className("fsl"));
        String msg = errorMsg.getText();
        System.out.println("Error Message: " + msg);

        driver.close();
    }
}
