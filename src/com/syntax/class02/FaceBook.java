package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
    public static void main(String[] args) throws InterruptedException {
        //navigate to fb.com
        //click on create new account
        //fill up all the textboxes
        //click on sign up button
        //close the pop up
        //close the browser

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("John");
        driver.findElement(By.name("lastname")).sendKeys("Doe");
        driver.findElement(By.name("reg_email__")).sendKeys("johndoe@fakeemail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("johndoe@fakeemail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("fakepassword123");
        driver.findElement(By.name("websubmit")).click();
        driver.findElement(By.cssSelector("img[class='_8idr img']")).click();
        driver.close();






    }
}
