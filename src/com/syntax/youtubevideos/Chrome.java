package com.syntax.youtubevideos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        // making an instance of the webdriver interface, named it driver, and using polymorphism so we can use methods
        // inside the chromdriver class
        driver.get("https:www.amazon.com");
        driver.navigate().to("htpps:www.facebook.com");



    }
}
