package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class D18HandlingDropdownList
{
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

        WebElement drpList = driver.findElement(By.id("country"));
        Select countries = new Select(drpList);

        System.out.println("Selected Country: " + countries.getFirstSelectedOption().getText());

        List<WebElement>countryList = countries.getOptions();
        System.out.println("Total countries: " + countryList.size());

        int i = 0;
        for (WebElement c : countryList) {
            System.out.println(i + ". " + c.getText());
            i++;
        }
        //countries.selectByVisibleText("United States");
        //countries.selectByValue("222");
        countries.selectByIndex(219);
        System.out.println("Selected Country: " + countries.getFirstSelectedOption().getText());

    }
}
