package com.syntax.class07;

import javafx.beans.property.SetProperty;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Task2 {
    /*
    navigate to http://www.uitestpractice.com/Students/Contact
click on the link
get text
print out in the console
     */
    public static String url= "http://www.uitestpractice.com/Students/Contact";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement link = driver.findElement(By.xpath("//a[@data-ajax='true']"));
        link.click();
        WebElement  paragraph = driver.findElement(By.xpath("//div/p"));
        System.out.println(paragraph.getText());

    }
}
