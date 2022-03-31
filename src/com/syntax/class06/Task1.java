package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    /*
    Task
Navigate to https://syntaxprojects.com/bootstrap-iframe.php
verify the header text AUTOMATION TESTING PLATFORM BY SYNTAX is displayed
verify enroll today button is enabled
     */
    public static String url = "https://syntaxprojects.com/bootstrap-iframe.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String expectedHeader = "AUTOMATION TESTING PLATFORM BY SYNTAX";
        WebElement HeaderElement = driver.findElement(By.xpath("//span[text()='AUTOMATION TESTING PLATFORM BY SYNTAX']"));
        String HeaderText = HeaderElement.getText();
       // System.out.println(HeaderText);
        if (expectedHeader.equals(HeaderText)) {
            System.out.println("there is a match on header text");
        } else {
            System.out.println("The header text does not match expected outcome");
        }
        Thread.sleep(2000);
        driver.switchTo().frame(1);
        //verify enroll today button is enabled
        WebElement enroll = driver.findElement(By.xpath("//div[text ( ) ='Enroll today']"));
        Thread.sleep(2000);
        //System.out.println(enroll.isEnabled());
        if (enroll.isEnabled()) {
            System.out.println("The enroll today button is enabled");
        }
        else {
            System.out.println("The enrol today button is not enabled");
        }


    }
}
