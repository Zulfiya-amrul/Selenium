package com.syntax.youtubevideos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();      driver.get("https://www.facebook.com");
        WebElement createAccountButton = driver.findElement(By.xpath("//a[text()='Create new account']"));
        createAccountButton.click();       Thread.sleep(2000);
        WebElement firstname= driver.findElement(By.xpath("//input[@name='firstname']"));
        firstname.sendKeys("Habib");
        WebElement lastname= driver.findElement(By.xpath("//input[@name='lastname']"));
        lastname.sendKeys("Fedaee");
        WebElement email= driver.findElement(By.xpath("//input[@name='reg_email__']"));
        email.sendKeys("habib.fedaee@gmail.com");
        Thread.sleep(4000);
        WebElement emailConfirmation= driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
        ////input[@name='reg_email__confirmation__']
        ////input[@name='reg_email_confirmation__']
        emailConfirmation.sendKeys("habib.fedaee@gmail.com");
        WebElement password= driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
        password.sendKeys("hahahah");
        WebElement months = driver.findElement(By.xpath("//select[@name='birthday_month']"));
        Select selectM = new Select(months);         selectM.selectByValue("8");
        WebElement days = driver.findElement(By.xpath("//select[@name='birthday_day']"));
        Select selectD = new Select(days); selectD.selectByValue("20");
        WebElement years = driver.findElement(By.xpath("//select[@name='birthday_year']"));
        Select selectY = new Select(years); selectY.selectByValue("1944");
        WebElement maleGender = driver.findElement(By.xpath("//label[text() ='Male']"));
        maleGender.click();
        WebElement submitButton = driver.findElement(By.xpath("//button[@name='websubmit']"));
        Thread.sleep(3000);        submitButton.click();

    }
}
