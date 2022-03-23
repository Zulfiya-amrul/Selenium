package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver(); // launch the browser
        driver.get ("https://www.google.com"); // navigate to the specified url

       // System.out.println(driver.getCurrentUrl());
       // System.out.println(driver.getTitle());
       // driver.quit();

        String url= driver.getCurrentUrl();
        String actualUrl = "https://www.google.com/";

        if (url.equals(actualUrl)) {
            System.out.println("the url is correct");
        }
        else {
            System.out.println("the url is incorrect");
        }
        System.out.println(url);
        System.out.println(actualUrl);

        String title= driver.getTitle();
        String actualTitle = "Google";
         if (title.equals(actualTitle)) {
             System.out.println("the title is correct");
         }
         else {
             System.out.println("the title is incorrect");
         }

         driver.quit();
    }
}
