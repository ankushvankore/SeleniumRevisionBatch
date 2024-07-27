package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D17HandlingRadioButton
{
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

        WebElement gender = driver.findElement(By.cssSelector("input[value=\"f\"]"));

        System.out.println("Before...");
        System.out.println("Check box Selected: " + gender.isSelected());
        System.out.println("Check box Enabled : " + gender.isEnabled());
        System.out.println("Check box Visible : " + gender.isDisplayed());

        gender.click();

        System.out.println("\nAfter...");
        System.out.println("Check box Selected: " + gender.isSelected());
        System.out.println("Check box Enabled : " + gender.isEnabled());
        System.out.println("Check box Visible : " + gender.isDisplayed());


    }
}
