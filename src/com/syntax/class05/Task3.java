package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Task3 {
    /*
    Go to ebay.com
get all the categories and print them in the console
select Computers/Tables & Networking
click on search
verify the header
     */
    public static String url = "https://www.ebay.com/";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement categoriesDD = driver.findElement(By.xpath("//select[@aria-label= 'Select a category for search']"));
        Select selectCategories = new Select(categoriesDD);
        List<WebElement> allOptionsCat = selectCategories.getOptions();
        for (WebElement option :allOptionsCat) {
            String optionText =option.getText();
            System.out.println(optionText);
        }
        Thread.sleep(2000);
        selectCategories.selectByVisibleText("Computers/Tablets & Networking");
        driver.findElement(By.xpath("//input[@type= 'submit']")).click();
        Thread.sleep(2000);
       // System.out.println(driver.getTitle());
        if (driver.getTitle().equals("Computers, Tablets & Network Hardware")) {
            System.out.println("the title is verified to be correct");
        }
        else {
            System.out.println("the title does not match expected outcome");
        }
    }
}
