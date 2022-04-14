package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithKeys {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));//username /we get an web element in return.
        username.sendKeys("Tester", Keys.TAB);
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password")); //password
        password.sendKeys("test", Keys.ENTER);
        //WebElement loginButton= driver.findElement(By.className("button"));
        //loginButton.click();//log in button
        // Key is an enum from Selenium it is used to automate the actions of our computer keyboard
        // Key.TAB - goes to the next textbox
    }
}