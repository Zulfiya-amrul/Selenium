package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {
    public static String url = "http://syntaxprojects.com/dynamic-data-loading-demo.php";
/*
click on the new user
get the firstname txt
print out in console
 */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement getNewUserButton = driver.findElement(By.id("save"));
        getNewUserButton.click();

        WebDriverWait wait = new WebDriverWait (driver, 20);// we need to put condition inside the construction, 1- how long you wait
        // 2- what it is used to perform the action on the page with selenium
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'First Name')]")));

        WebElement firstName= driver.findElement(By.xpath("//p[contains(text(),'First Name')]"));


        System.out.println(firstName.getText());


    }
}
