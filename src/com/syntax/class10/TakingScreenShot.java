package com.syntax.class10;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class TakingScreenShot {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));

        username.sendKeys("Tester");

        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");

        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();

        TakesScreenshot ts= (TakesScreenshot) driver; // take screenshot interface and
        /// and cast it inside
        File srcFile= ts.getScreenshotAs(OutputType.FILE); //  // the screenshot is taken on this step


        try {
            FileUtils.copyFile(srcFile, new File("screenshots/SmartBear/adminLogin111.png"));
        } catch (IOException e) {
            e.printStackTrace();
        } // for macs we do command option T


    }
}
