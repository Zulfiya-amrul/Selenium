package com.syntax.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumReviewBasics {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver(); // creating an instance of the chrome driver
        driver.get("https://demoqa.com/text-box");
        //driver.navigate().to("https://www.gmail.com");
        WebElement username = driver.findElement(By.id("userName"));
        username.sendKeys("NAMENAME");
        username.clear();
        Thread.sleep(2000);
        username.sendKeys("Fire");

    }
}
