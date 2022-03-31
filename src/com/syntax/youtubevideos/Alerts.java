package com.syntax.youtubevideos;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        String Alerts = "https://syntaxprojects.com/javascript-alert-box-demo.php";
        driver.get(Alerts);

        //WebElement alert1=
        // WebElement alert2=
        // WebElement alert3=
        Alert alert = driver.switchTo().alert();
        alert.accept();
        alert.dismiss();
        alert.sendKeys("Hello Class");


    }
}
