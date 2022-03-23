package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        // doing the code below the chromedriver will launch a new broswer window
        WebDriver driver = new ChromeDriver(); // creating an object of interface(webdriver)
        // webdriver being an interface does not have any implemented elements
        // chromedriver inherits web-driver interface class
        // indirectly creating class of the interface
        // imports are coming from selenium library

        // nagivated to the website listed below
        driver.get("https://www.google.com/");
        String url= driver.getCurrentUrl();
        System.out.println(url);
        String title = driver.getTitle();
        System.out.println(title);
        driver.quit();


    }
}
