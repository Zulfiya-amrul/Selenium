package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    /*
    Go to https://syntaxprojects.com/javascript-alert-box-demo.php
click on each button and handle the alert accordingly
     */
    public static String url = "https://syntaxprojects.com/javascript-alert-box-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement firstAlert = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        WebElement secondAlert = driver.findElement(By.xpath("//button[@onclick= 'myConfirmFunction()']"));
        WebElement thirdAlert = driver.findElement(By.xpath("//button[text()='Click for Prompt Box']"));

        firstAlert.click();
        Alert alert1 = driver.switchTo().alert();
        Thread.sleep(2000);
        alert1.accept();

        Thread.sleep(2000);

        secondAlert.click();
        Alert alert2 = driver.switchTo().alert();
        Thread.sleep(2000);
        alert2.dismiss();

        Thread.sleep(2000);
        thirdAlert.click();
        Alert alert3 = driver.switchTo().alert();
        Thread.sleep(2000);
        alert3.sendKeys("Hello World");
        alert3.accept();
    }
}
