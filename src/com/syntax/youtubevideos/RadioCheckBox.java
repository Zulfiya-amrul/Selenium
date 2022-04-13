package com.syntax.youtubevideos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioCheckBox {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        String radioPath = "https://syntaxprojects.com/basic-radiobutton-demo.php";
        driver.get(radioPath);

        List<WebElement> radio = driver.findElements(By.name("optradio"));

        for (WebElement webElement : radio) {
            String value = webElement.getAttribute("value");


            if (value.equalsIgnoreCase("Female")) {
                webElement.click();
                break;
            }
        }


    }
}
