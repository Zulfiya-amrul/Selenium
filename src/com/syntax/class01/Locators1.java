package com.syntax.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {
    public static void main(String[] args) {
        /*
        locators in Selenium also known as ATTRIBUTES
        1- ID
        2- className
        3- name
        4- tagName
        5- linkText
        6- PartialLinkText
        7- cssSelector - part of how we build web applications, faster, native to the browser,
        8- xpath
        2 types
         relative- using any attribute in a particular element, finds exactly where it is in the DOM, goes directly
         absolute- its location from top to bottom, if the path changed down the line it will no longer work

         */

    /*
    4- tagName in detail
    TAGS IN A DOM
    using By.tagName for the following listed tags
    < div
    < form
    < input
    < ins
     */

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        String Path = "https://demoqa.com/text-box";
        String Linkpath = "https://demoqa.com/links";

        // driver.get (Linkpath);
        //  driver.findElement(By.id("userName"));
        //  driver.findElement(By.linkText("Home")).click();
        // driver.findElement(By.partialLinkText("me")).click();

        driver.get(Path);
        /*
         how to format xpath locator --> // tag [@id="userName"]
         // --> means relative xpath
         /  --> means absolute xpath
         */

                        //  xpath
       // driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Hello");



                                // cssSelector
          driver.findElement(By.cssSelector("input[id='userName']")).sendKeys("Good Class");
    }
}
