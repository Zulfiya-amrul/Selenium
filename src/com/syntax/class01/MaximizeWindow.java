package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWindow {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.amazon.com/");
       // driver.manage().window().maximize(); // will use this method in real life most
        driver.manage().window().fullscreen();// no control panel, dont see the tabs,
        driver.manage().window().maximize();


    }
}
