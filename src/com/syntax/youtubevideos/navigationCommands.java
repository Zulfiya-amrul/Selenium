package com.syntax.youtubevideos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigationCommands {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
     /*   driver.get("https:www.google.com");
        driver.navigate().to("https://www.facebook.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();*/

        // get commands
        String path = "https://www.google.com/";
        driver.get(path);
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        String url= driver.getCurrentUrl();
        String title= driver.getTitle();
        if (url.equals(path)) {
            System.out.println("match");
        }
        else {
            System.out.println("no match");
        }
        if (title.equalsIgnoreCase("Google")) {
            System.out.println("match");
        }
        else {
            System.out.println("no match");
        }

        driver.quit();


    }
}
