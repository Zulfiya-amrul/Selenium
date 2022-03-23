package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver"); // key, value //
        // what tool we want to use,  where to find that tool
        WebDriver driver= new ChromeDriver(); // WebDriver is an interface, we imported it into our class,
      //  driver.get("https://www.amazon.com/");
        driver.get("https:www.google.com");
        //- get waits and holds the commands until the whole page is fully loaded and ready to recieve commands



        driver.navigate().to("https:www.facebook.com");
        // navigate doesnt hold the commands for the page to fully load, doenst wait
        // nagivate saves the previous history of the browser, git doesnt

        driver.navigate ().to("https:www.facebook.com");

        driver.navigate ().back();

        driver.navigate().forward();

        driver.navigate().refresh();


    }
}
