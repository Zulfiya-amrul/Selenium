package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class Task1 {
    public static void main(String[] args) {
        /*
         * Task
         * Navigate to http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx
         * Login
         * Get title and verify
         * logout
         * close the browser
         */


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();

        String title = "Web Orders";
        String actualTitle = driver.getTitle();
        System.out.println(driver.getTitle());

        if (title.equals(actualTitle)) {
            System.out.println("the title matches");
        }
        else {
            System.out.println("the title does not match");
        }


        driver.findElement(By.id("ctl00_logout")).click();
        driver.quit();
    }
}
