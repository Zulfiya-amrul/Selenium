package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {
    public static String url = "http://www.uitestpractice.com/Students/Switchto";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement simpleAlertButton = driver.findElement(By.id("alert"));
        // Identified the alert button
        simpleAlertButton.click();
        // clicked on the alert button, and the focus of selenium is lost
        Alert simpleAlert = driver.switchTo().alert();
        // telling selenium to switch the focus on the alert sinse it lost the focus once the pop-up showed up

        Thread.sleep(2000);
        simpleAlert.accept();// handling simple alerts

        WebElement confirmAlertButton = driver.findElement(By.id("confirm"));
        confirmAlertButton.click();
        Thread.sleep(2000);
        Alert confirmAlert = driver.switchTo().alert();

        String alertText = confirmAlert.getText();
        System.out.println(alertText);
        confirmAlert.dismiss();

        WebElement promtAlettButton = driver.findElement(By.cssSelector("button#prompt"));
        promtAlettButton.click();
        Thread.sleep(2000);
        Alert promptAlert = driver.switchTo().alert();
        promptAlert.sendKeys("Batch 12 is the Best");
        promptAlert.accept();










    }
}
