package com.syntax.review2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        WebElement femaleRadiobutton = driver.findElement(By.xpath("//input[@name='optradio'and@value='Female']"));
        //femaleRadiobutton.click();

        //Check if the radio button is enabled.
        System.out.println("The female radio button is enabled " + femaleRadiobutton.isEnabled());

        // check if female radiobutton is displayed..
        femaleRadiobutton.isDisplayed();
        System.out.println("The female radio button is displayed " + femaleRadiobutton.isDisplayed());
        // to check if its selected or not

        femaleRadiobutton.isSelected();
        System.out.println("The female radio button is displayed " + femaleRadiobutton.isSelected());

        // check if the female radio button s not selected
        if (!femaleRadiobutton.isSelected()) {
            femaleRadiobutton.click();
            System.out.println("The female radio button is displayed " + femaleRadiobutton.isSelected());
        }
// get all the links in the currect webpage and print their text
        List<WebElement> links = driver.findElements(By.tagName("a"));

        for (WebElement link: links) {
            System.out.println(link.getText());
        }


    }
}