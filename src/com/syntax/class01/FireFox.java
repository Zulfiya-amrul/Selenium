package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {
    public static void main(String[] args) {
        // 1- set properties
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
        // what tool we want to use, and where to find that tool
        // 2- create a webdriver interface, crate instance of it
        WebDriver driver = new FirefoxDriver();

        driver.get("https:www.google.com");

        //





    }
}
