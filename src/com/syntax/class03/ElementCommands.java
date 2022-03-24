package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementCommands {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.uitestpractice.com/Students/Form");
        WebElement marriedRadioButton = driver.findElement(By.xpath("//input[name='optradio'])[1]"));
        boolean isMarriedenabled = marriedRadioButton.isEnabled();
        System.out.println(isMarriedenabled);

    }
}
