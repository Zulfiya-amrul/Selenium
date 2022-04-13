package com.syntax.youtubevideos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeBroswerCammands {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        String expectedTitle= "Google";
        String expectedUrl= "https://www.google.com/";
        if (driver.getTitle().equalsIgnoreCase("Google")) {
            System.out.println("the title matches");
        }
        else {
            System.out.println("the title dont match");
        }
        if (driver.getCurrentUrl().equalsIgnoreCase("https://www.google.com/")) {
            System.out.println("the titles match");
        }
        else {
            System.out.println("the titles dont match");
        }
        driver.quit();
    }
}
