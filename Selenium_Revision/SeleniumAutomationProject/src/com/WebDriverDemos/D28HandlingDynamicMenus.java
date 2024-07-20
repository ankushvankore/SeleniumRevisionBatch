package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class D28HandlingDynamicMenus
{
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.navigate().to("https://www.thetestingsquad.in/2023/01/what-is-getwindowhandle-and.html#:~:text=Differences%20Between%20getWindowHandle%20and%20getWindowHandles,or%20tabs%20in%20the%20browser.");

        List<WebElement>menus = driver.findElements(By.xpath("//*[@id=\"techmag-free-main-menu-nav\"]/li/a"));

        for(WebElement m : menus)
            System.out.println(m.getText());

        driver.close();
    }
}
