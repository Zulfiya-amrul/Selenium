package com.syntax.class05;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class CheckBoxDemo {
    // moving the local variable to location outside of the main class, so the variable is no longer local variable
    // now it is an instans variable
    // adding public static access modifier,
    // wont work if its not static, because we cannot have non static variables inside the static method
    // method is static so the variables need to be static too

    public static String url = "https://syntaxprojects.com/basic-checkbox-demo.php";


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        // locating checkboxes and storing them in the list
        List<WebElement> optionCheckBoxes = driver.findElements(By.cssSelector("input[class='cb1-element']"));
        int size = optionCheckBoxes.size();
        System.out.println(size);
        // looping through each element from the list line 21
        for (WebElement option : optionCheckBoxes) {

            String checkBoxValue = option.getAttribute("value");
            if (checkBoxValue.equals("Option-2")) {
                option.click();
                break;
              }
        }

    }
}
