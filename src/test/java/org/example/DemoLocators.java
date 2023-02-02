package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class DemoLocators{
    @Test
    public void test(){
        System.out.println("welcome");
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https:/github.com/login");
        driver.findElement(By.id("login_field")).sendKeys("2000030021@kluniversity.in");
        driver.findElement(By.name("password")).sendKeys("Supriya5.");
        //driver.findElement(By.className("header.logo"));
        driver.findElement(By.linkText("Forgot password?")).click();

    }
}