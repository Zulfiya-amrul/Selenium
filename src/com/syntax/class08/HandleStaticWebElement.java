package com.syntax.class08;

import com.syntax.class02.WebOrders;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class HandleStaticWebElement {
    public static String url = "http://syntaxprojects.com/table-search-filter-demo.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/table-search-filter-demo.php");
        List<WebElement>rowData=driver.findElements(By.xpath("//table[@id = 'task-table']/tbody/tr"));
        // we got located the elements of each row using xpath
        // then we assined it to rowData variable
        // because we had 7 different webelements we assigned that whole data to List of WebElements

        System.out.println(rowData.size());

        // creating the iterator, we are iterating through the WebElements
        //
        Iterator<WebElement> it=rowData.iterator();

        while ((it.hasNext())){

            WebElement row= it.next();
            // we are iterating through each row in the table, or also u can say webelement

            String rowText= row.getText();

            System.out.println(rowText);
        }
        System.out.println("--------------now we want to print all header data --------------");
        List<WebElement>colomnData=driver.findElements(By.xpath("//table[@id = 'task-table']/thead/tr/th"));
        System.out.println(colomnData.size());
        for (WebElement colData: colomnData) {
            String coltex = colData.getText();
            System.out.println(coltex);
        }
    }

}
