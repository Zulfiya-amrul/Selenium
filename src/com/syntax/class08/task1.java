package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class task1 {
    public static String url = " http://syntaxprojects.com/dynamic-elements-loading.php";

    /*
    navigate  http://syntaxprojects.com/dynamic-elements-loading.php
    click start button
     get text
     print out on console
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement button = driver.findElement(By.id("startButton"));
        button.click();
        WebDriverWait wait = new WebDriverWait(driver, 20);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), 'Welcome')]")));
        WebElement text= driver.findElement(By.xpath("//*[contains(text(), 'Welcome')]"));
        System.out.println(text.getText());


    }
}
