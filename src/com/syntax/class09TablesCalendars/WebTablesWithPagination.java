package com.syntax.class09TablesCalendars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTablesWithPagination {

    public static String url = "http://syntaxprojects.com/table-pagination-demo.php";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table table-hover']/tbody/tr"));
        WebElement nextButton = driver.findElement(By.xpath("//*[@id=\"myPager\"]/li[3]/a")); //  //a[@class='next_link']
        boolean flag = true;

        while (flag) {

            for (WebElement row : rows) {
                String rowText = row.getText();
                if (rowText.contains("Archy J")) {
                    flag = false;
                    System.out.println(rowText);
                }
            }
            if (flag) {
                nextButton.click();
            }
        }


    }
}
/*
to print all pages without empty spaces
boolean flag = true;
while (flag) {
    for (WebElement row : rows) {
        String rowText = row.getText();
        if (!rowText.isEmpty()) {
            System.out.println(rowText);
        } else {
            nextButton.click();
        }
    }
}
 */