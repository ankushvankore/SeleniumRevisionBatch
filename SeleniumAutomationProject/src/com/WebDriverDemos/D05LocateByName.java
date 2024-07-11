package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class D05LocateByName
{
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");
        //System.out.println("Enter id: ");
       // String id = new Scanner(System.in).next();

        WebElement emailId = driver.findElement(By.name("email"));
        emailId.sendKeys("ankushvankore@gmail.com");
        //emailId.sendKeys(id);
        WebElement password = driver.findElement(By.name("pass"));
        password.sendKeys("1234567890");
        WebElement loginBtn = driver.findElement(By.name("login"));
        loginBtn.click();

    }
}
