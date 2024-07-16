package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D16HandlingCheckbox
{
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

        WebElement chkBox = driver.findElement(By.cssSelector("input[name^=\"chk_altemail\"]"));
        System.out.println("Check box Selected: " + chkBox.isSelected());
        System.out.println("Check box Enabled : " + chkBox.isEnabled());
        System.out.println("Check box Visible : " + chkBox.isDisplayed());

        //if(chkBox.isSelected() == false)
        if(!chkBox.isSelected())
            chkBox.click();

        System.out.println("Check box Selected: " + chkBox.isSelected());
        System.out.println("Check box Enabled : " + chkBox.isEnabled());
        System.out.println("Check box Visible : " + chkBox.isDisplayed());

        driver.close();
    }
}
