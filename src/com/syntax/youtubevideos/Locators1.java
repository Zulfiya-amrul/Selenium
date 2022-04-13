package com.syntax.youtubevideos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {
    public static void main(String[] args) {

        /*
        Locators in Selenium
        1) ID
        2) ClassNameeeeee
        3) name
        4) tagName

        5)linkedText
        6) partial linked text


         */

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        String Path = "https://demoqa.com/text-box";
        String LinkPath = "https://demoqa.com/links";

        // driver.get(LinkPath);

        // driver.findElement(By.linkText("Home")).click();
        //  driver.findElement(By.partialLinkText("me")).click();
        //css selector and xpath
        // x paths - relative and absolute
        // css selectors are faster

        /*
                //tag [@attribute='attribute value']
         */
        driver.get(Path);
      //  driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Hello");
        driver.findElement(By.cssSelector("input[id='userName']")).sendKeys("good class");
    }
}
