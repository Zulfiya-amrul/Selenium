package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task2 {
    /*
HW1
Go to facebook sign up page
Fill out the whole form
Click signup
     */
    public static String url = "https://www.facebook.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement accountCreate = driver.findElement(By.linkText("Create new account"));
        accountCreate.click();
        Thread.sleep(1000);
        WebElement name = driver.findElement(By.name("firstname"));
        name.sendKeys("Jenny");
        Thread.sleep(1000);
        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Jones");
        Thread.sleep(1000);
        WebElement email = driver.findElement(By.name("reg_email__"));
        email.sendKeys("fake.email@gmail.com");
        Thread.sleep(1000);
        WebElement emailConfirm= driver.findElement(By.name("reg_email_confirmation__"));
        emailConfirm.sendKeys("fake.email@gmail.com");
        WebElement password = driver.findElement(By.id("password_step_input"));
        password.sendKeys("1234678");
        Thread.sleep(1000);

        WebElement monthDD =driver.findElement(By.name("birthday_month"));
        Select selectMonth = new Select(monthDD);
        selectMonth.selectByVisibleText("Jan");
        Thread.sleep(1000);
        WebElement dayDD = driver.findElement(By.id("day"));
        Select selectDay= new Select(dayDD);
        selectDay.selectByVisibleText("3");
        Thread.sleep(1000);
        WebElement yearDD = driver.findElement(By.id("year"));
        Select selectYear = new Select (yearDD);
        selectYear.selectByVisibleText("1999");
        driver.findElement(By.xpath("//input[@value='1']")).click();
        driver.findElement(By.name("websubmit")).click();

    }
}
