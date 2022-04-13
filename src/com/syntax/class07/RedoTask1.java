package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class RedoTask1 {

        public static String url = "https://demoqa.com/browser-windows";

        public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get(url);

            String mainPageHandle = driver.getWindowHandle();
            System.out.println("main handle: "+mainPageHandle);

            WebElement newTab = driver.findElement(By.id("tabButton"));
            newTab.click();
            System.out.println(newTab.getText());

            WebElement newWindow = driver.findElement(By.id("windowButton"));
            newWindow.click();
            System.out.println(newWindow.getText());

            Set<String> allWindowHandles = driver.getWindowHandles();
            System.out.println(allWindowHandles.size());

            Iterator<String> it = allWindowHandles.iterator();
            while (it.hasNext()) {
                String handle = it.next();
                String title = driver.getTitle();
                System.out.println(title);
                System.out.println(handle);
            }
            driver.quit();
        }
    }

