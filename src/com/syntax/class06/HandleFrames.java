package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {
    public static String url = "http://www.uitestpractice.com/Students/Switchto";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.switchTo().frame(0);
        WebElement txtbox = driver.findElement(By.id("name"));
        txtbox.sendKeys("Hello");

        driver.switchTo().defaultContent();// go back to main window get ouf ot frame


        WebElement alertButton = driver.findElement(By.id("alert"));
        alertButton.click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        driver.switchTo().frame("iframe_a");
        txtbox.sendKeys("We are back ");
        driver.switchTo().defaultContent();

        WebElement frameElement = driver.findElement(By.xpath("//iframe[@src='/Demo.html'] "));

        driver.switchTo().frame(frameElement);
        txtbox.clear();
        txtbox.sendKeys("Hold your horses");




    }
}
