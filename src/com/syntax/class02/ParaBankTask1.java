package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaBankTask1 {
    public static void main(String[] args) {

        //navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
        //fill out the form
        //click on register
        //close the browser
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");


        driver.findElement(By.id("customer.firstName")).sendKeys("John");
        driver.findElement(By.id("customer.lastName")).sendKeys("Doe");
        driver.findElement(By.id("customer.address.street")).sendKeys("Happy Valley Street");
        driver.findElement(By.id("customer.address.city")). sendKeys("Boise");
        driver.findElement(By.id("customer.address.state")).sendKeys("Idaho");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("98765");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("123456789");
        driver.findElement(By.id("customer.ssn")).sendKeys("768540694");
        driver.findElement(By.id("customer.username")).sendKeys("Johndoe");
        driver.findElement(By.id("customer.password")).sendKeys("password123");
        driver.findElement(By.id("repeatedPassword")).sendKeys("password123");
        driver.findElement(By.className("button")).click();
        driver.close();




      //  address  customer.address.state


    }
}
