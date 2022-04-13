package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AmazonDropdown {
    public static String url = "http://amazon.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement categoriesDD = driver.findElement(By.id("searchDropdownBox"));
        // we find the web element for the drop down and store it inside the WebELement named CategoriesDD
        Select select = new Select(categoriesDD);
        // because our web element inside the DOM had the Select tag we are able to find elements using select methods
        // we create the object of Select class and name that obj lower-case select
        List<WebElement> options = select.getOptions();
        // because we are dealing with multiple web elements from the drop-down we use a List
        // we store the values of all web elements the list named -options
        // by using the method from select class (select.getOptions () ) we can get all list of Drop down names in one list

        for (WebElement option : options) {
            String optionText = option.getText(); // use getText() method because want the text of each drop down

            System.out.println(optionText);
        }

        select.selectByValue("search-alias=appliances");
    }
}