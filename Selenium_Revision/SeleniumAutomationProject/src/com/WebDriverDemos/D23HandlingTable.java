package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class D23HandlingTable
{
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");

        //driver.findElement(By.linkText("Money")).click();
       // driver.findElement(By.partialLinkText("More")).click();

        //List<WebElement>headers = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
        List<WebElement>headers = driver.findElements(By.tagName("th"));
        for (WebElement h : headers)
            System.out.println(h.getText());

        List<WebElement>rows = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));

        System.out.println("Total Rows: " + rows.size());

        Random rnd = new Random();

        //int i = rnd.nextInt(11);        //Generates any random number in the range of 0 to 10
        int i = rnd.nextInt(rows.size());
        System.out.println(i);

        System.out.println(rows.get(i).getText());

        //*[@id="leftcontainer"]/table/tbody/tr[6]

        driver.close();
    }
}
