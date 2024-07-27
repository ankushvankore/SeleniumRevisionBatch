package com.Assignments;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class A05DemoQATable
{
    public static void main(String[] args) {
        int i = 0;
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demoqa.com/webtables");

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0, 255)", "");

        driver.findElement(By.id("addNewRecordButton")).click();

        String fName = "Monu";

        driver.findElement(By.id("firstName")).sendKeys(fName);
        driver.findElement(By.id("lastName")).sendKeys("Suryavanshi");
        driver.findElement(By.id("userEmail")).sendKeys("monu@gmail.com");
        driver.findElement(By.id("age")).sendKeys("25");
        driver.findElement(By.id("salary")).sendKeys("100000");
        driver.findElement(By.id("department")).sendKeys("Testing");
        driver.findElement(By.id("submit")).sendKeys(Keys.ENTER);

        List<WebElement>firstName = driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[2]/div/div/div[1]"));
        for(i = 0; i < firstName.size(); i++)
        {
            System.out.println(firstName.get(i).getText());
            if(firstName.get(i).getText().equals(fName))
                break;
        }
        System.out.println(i);

        //driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[2]/div["+(i+1)+"]/div/div[7]/div/span[2]")).click();
        js.executeScript("arguments[0].click()", driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[2]/div["+(i+1)+"]/div/div[7]/div/span[2]")));

        driver.close();
    }
}
