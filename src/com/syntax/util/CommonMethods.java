package com.syntax.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

  public class CommonMethods {
 /*
 create functions (methods) to open and close and quit the browsers
 open method has to accept a url as a parameter
  */
    public static void openBrowser(String url) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
    }
    public static void closeBrowser () {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.close();
    }
    public static void quitBrowser () {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.quit();
    }



}
