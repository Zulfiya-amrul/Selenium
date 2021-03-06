package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
    public static void main(String[] args) {
        /*
        HRMS Application Negative Login:
Open chrome browser
Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
Enter valid username
Leave password field empty
Click on login button
Verify error message with text "Password cannot be empty" is displayed.
         */
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement username= driver.findElement(By.xpath("//input[@id= 'txtUsername']"));
        username.sendKeys("Admin");
        WebElement clickButton= driver.findElement(By.cssSelector("input#btnLogin"));
        clickButton.click();
        WebElement error= driver.findElement(By.id("spanMessage"));
        if (error.isDisplayed()) {
            System.out.println("password cannot be empty");
        }
        driver.quit();



    }
}
