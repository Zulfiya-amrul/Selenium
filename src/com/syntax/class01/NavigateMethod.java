package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.applet.Main;

public class NavigateMethod {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        driver.navigate().to("https://www.google.com/");
        driver.navigate().back();
        driver.navigate().forward();
        Thread.sleep(2000); // pauses execution for 2 seconds
        driver.navigate().refresh();
       // driver.close (); // will close the current/active tab
        driver.quit (); // will close all tabs

        // this example we will only have one window that will open.
        // because we only launch one browser on line 13
        // with navigate we can go back and forth -- has more ability on the browser









    }
}
