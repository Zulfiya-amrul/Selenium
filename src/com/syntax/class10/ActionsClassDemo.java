package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionsClassDemo {
    public static String  url = "https://www.amazon.com/";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        // navigate to amazaon
        // hover over the cursor onto lists

        WebElement accountsAndLists = driver.findElement(By.id("nav-link-accountList"));
        // you use this to hover over an element on the website on the drop down menu
        Actions action = new Actions(driver);
        action.moveToElement(accountsAndLists).perform();


    }
}
