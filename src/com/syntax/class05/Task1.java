package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Task1 {
    /*
    TC 1: Facebook dropdown verification
    Open chrome browser Go to “https://www.facebook.com” click on create new account
Verify:
month dd has 12 month options
day dd has 31 day options
year dd has 115 year options
Select your date of birth
Quit browser
     */

    public static String url = "https://www.facebook.com";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement accountCreate = driver.findElement(By.linkText("Create new account"));
        accountCreate.click();
        Thread.sleep(3000);
        // verify month dd has 12 months
        WebElement monthsDD = driver.findElement(By.name("birthday_month"));
        Select selectMonths = new Select(monthsDD);
        List<WebElement> allOptions = selectMonths.getOptions();
        int size = allOptions.size();
        if (size == 12) {
            System.out.println("Verifying that month drop-down has " + size + " months");
        }
        Thread.sleep(3000);
        //day dd has 31 day options
        WebElement dayDD = driver.findElement(By.id("day"));
        Select selectDays = new Select(dayDD);
        List<WebElement> allOptionsDays = selectDays.getOptions();
        int daySize = allOptionsDays.size();
        if (daySize == 31) {
            System.out.println("verifying that days drop down has " + daySize + " days");
        }
        Thread.sleep(3000);
        // year dd has 115 year options
        WebElement yearDD = driver.findElement(By.id("year"));
        Select selectYear = new Select(yearDD);
        List <WebElement>  allOptionsYear = selectYear.getOptions();
        int yearSize = allOptionsYear.size();
        System.out.println(yearSize);
        if (yearSize==115) {
            System.out.println("verifying that year drop down has " + yearSize + " years");
        }
        else {
            System.out.println("year drop down doesnt have 115 years instead it has "+yearSize );
        }
        //Select your date of birth
        selectMonths.selectByVisibleText("Jun");
        Thread.sleep(3000);
        selectDays.selectByValue("7");
        Thread.sleep(3000);
        selectYear.selectByVisibleText("1992");
        driver.quit();


    }
}
