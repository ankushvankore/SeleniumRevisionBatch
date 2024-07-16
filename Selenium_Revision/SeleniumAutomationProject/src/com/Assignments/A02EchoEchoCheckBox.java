package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class A02EchoEchoCheckBox
{
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://echoecho.com/htmlforms09.htm");

        //List<WebElement>chkBoxes = driver.findElements(By.cssSelector("input[name^=\"option\"]"));
        List<WebElement>chkBoxes = driver.findElements(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input"));
        for(WebElement chk1 : chkBoxes) {
            System.out.println("Before...");
            System.out.println(chk1.getAttribute("value") + " Selected: " + chk1.isSelected());
            System.out.println(chk1.getAttribute("value") + " Enabled : " + chk1.isEnabled());
            System.out.println(chk1.getAttribute("value") + " Visible : " + chk1.isDisplayed());
            if (!chk1.isSelected())
                chk1.click();

            System.out.println("\nAfter...");
            System.out.println(chk1.getAttribute("value") + " Selected: " + chk1.isSelected());
            System.out.println(chk1.getAttribute("value") + " Enabled : " + chk1.isEnabled());
            System.out.println(chk1.getAttribute("value") + " Visible : " + chk1.isDisplayed());

        }

    }
}
