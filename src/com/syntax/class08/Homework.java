package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Homework {
    /*
    go to https://the-internet.herokuapp.com/dynamic_controls
click on checkbox and click on remove
verify the text
click on enable verify the textbox is enabled
enter text and click disable
verify the textbox is disabled
     */
    public static String url = "https://the-internet.herokuapp.com/dynamic_controls";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement checkBox1 = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox1.click();
        WebElement removeBtn = driver.findElement(By.xpath("//button[text()='Remove']"));
        removeBtn.click();
        //driver.findElements(By.id("search")).length();
        driver.findElements(By.name("search")).size();

        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));

        WebElement message = driver.findElement(By.xpath("//p[@id='message']"));
        if (message.getText().equals("It's gone!")) {
            System.out.println("the checkbox has been unchecked successfully");
        }
        else {
            System.out.println("there was an error in removing");
        }
      //  System.out.println(message.getText());

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text() ='Enable']")));
        WebElement enable = driver.findElement(By.xpath("//button[text() ='Enable']"));
        enable.click();
        WebElement message2 = driver.findElement(By.xpath("//p[@id='message']"));
       if (message2.getText().equals("It's enabled!")) {
           System.out.println("the textbox is enabled");
       }

       // System.out.println(message2.getText());
        WebElement textBox = driver.findElement(By.xpath("//input [@type='text']"));
        textBox.sendKeys("Hello");
        driver.findElement(By.xpath("//button[text()='Disable']")).click();
        WebElement disabled = driver.findElement(By.xpath("//p[@id='message']"));
        if (disabled.getText().equals("It's disabled!")) {
            System.out.println("verified that textbox is disabled");
        }
        else {
            System.out.println("there was an error in disabling");
        }

    }
}
