package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A06RediffTable
{
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");

        List<WebElement>currentPrice = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[4]"));

        double[] cpArray = new double[currentPrice.size()];

        for(int i = 0; i < currentPrice.size(); i++)
        {
            //String p = currentPrice.get(i).getText();
            //p = p.replace(",","");
            //cpArray[i] = Double.parseDouble(p);
            cpArray[i] = Double.parseDouble(currentPrice.get(i).getText().replace(",", ""));
            //System.out.println(cpArray[i]);
        }
        Arrays.sort(cpArray);
        System.out.println("Highest Value: " + cpArray[cpArray.length-1]);

        driver.close();
    }
}
