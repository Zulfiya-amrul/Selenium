package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWait {

    public static String url = "https://syntaxprojects.com/index.php";

    /*
    click on buttons and open new windows (Tabs)
    switch to windows and perform different actions
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement startPracticingButton = driver.findElement(By.linkText("Start Practising"));
        startPracticingButton.click();


    }
}
