package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
/*
Go to https://demoqa.com/browser-windows
click on New Tab and print the text from new tab in the console
click on New Window and print the text from new window in the console
click on New Window Message and print the text from new window in the console
Verify (compare) the titles for each page
Print out the title of the all pages
 */
public class Task1 {
    static String url = "https://demoqa.com/browser-windows";

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        String mainPageHndl= driver.getWindowHandle();
        //System.out.println(mainPageHndl+ " this is the window handle ");

        WebElement newTab= driver.findElement(By.xpath("//*[@id=\"tabButton\"]"));
        newTab.click();
        WebElement newWindow= driver.findElement(By.xpath("//*[@id=\"windowButton\"]"));
        newWindow.click();
        WebElement newWindowMessage= driver.findElement(By.xpath("//*[@id=\"messageWindowButton\"]"));
        newWindowMessage.click();

        Set <String>  allWindowHandles= driver.getWindowHandles();
       // System.out.println(allWindowHandles +" all handles ");
        Iterator <String> iterator= allWindowHandles.iterator();
        while (iterator.hasNext()) {
            String handle = iterator.next();
            if (!mainPageHndl.equals(handle)) {
                driver.switchTo().window(handle);
                System.out.println("body text " + driver.findElement(By.cssSelector("body")).getText());

            }
            if (!driver.getTitle().isEmpty()) {
                System.out.println( driver.getTitle()+ " the title");
            }
            else{
                System.out.println("the title is empty");
            }


        }

    driver.quit();



       // String mainPageHandle = driver.getWindowHandle();


    }
}