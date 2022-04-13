package com.syntax.review03;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static String url = "https://syntaxprojects.com/javascript-alert-box-demo.php";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        //find the alert and click on it
        WebElement simpleAlert = driver.findElement(By.xpath("//button[@onclick= 'myAlertFunction()']"));
        simpleAlert.click();
        //handling simple alert
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();
        //promtAlert
        WebElement jsAlert = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        jsAlert.click();
        Thread.sleep(2000);
        driver.switchTo().alert();
        alert.sendKeys("hello everyone");
        alert.accept();
        driver.quit();


    }
}