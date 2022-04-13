package com.syntax.review03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
    public static String url = "https://chercher.tech/practice/frames";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement frame= driver.findElement(By.id("frame1"));
        driver.switchTo().frame(frame);
        WebElement frame3= driver.findElement(By.id("frame3"));
        driver.switchTo().frame(frame3);
        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkbox.click();
        driver.switchTo().defaultContent();



    }
}
