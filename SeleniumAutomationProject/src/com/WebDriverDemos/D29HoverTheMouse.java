package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class D29HoverTheMouse
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.navigate().to("https://www.thetestingsquad.in/2023/01/what-is-getwindowhandle-and.html#:~:text=Differences%20Between%20getWindowHandle%20and%20getWindowHandles,or%20tabs%20in%20the%20browser.");

        Actions act = new Actions(driver);

        //WebElement tLink = driver.findElement(By.linkText("Tutorials"));
        //act.moveToElement(tLink).perform();
        act.moveToElement(driver.findElement(By.linkText("Tutorials"))).perform();

        List<WebElement> subMenus = driver.findElements(By.xpath("//*[@id=\"techmag-free-main-menu-nav\"]/li[2]/ul/li/a"));
        for(WebElement sm : subMenus)
            System.out.println(sm.getText());

        Thread.sleep(5000);

        driver.close();
    }
}
