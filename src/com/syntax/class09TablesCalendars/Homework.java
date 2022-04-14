package com.syntax.class09TablesCalendars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Homework {
        /*
        http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
        click on leave
       --- click on leave list
       --- choose from "From calendar"
       --- choose from "To calendar"
        click only on cancelled and rejected checkboxes
        uncheck Pending Approval
        select IT support from DD
        click search
        quit the browser
         */
    static String url = " http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // login
        WebElement username= driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        //pass
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        // login button
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();
        WebElement leaveButton = driver.findElement(By.xpath("//b[text() ='Leave']"));
        leaveButton.click();
        // leave list
        WebElement leaveListButton = driver.findElement(By.xpath("//a[text() ='Leave List']"));
        leaveListButton.click();
        WebElement fromCal = driver.findElement(By.id("calFromDate"));
        fromCal.click();

        // finding web element for month dd
        WebElement monthdd = driver.findElement(By.cssSelector("select.ui-datepicker-month"));
        Select select = new Select (monthdd);
        select.selectByVisibleText("Aug");

        List<WebElement> fromDates= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));

        for (WebElement fromDate: fromDates) {
            String dataText= fromDate.getText(); // get the text of each date of the calendar,
            // to later check if it equals our desired date
            if (dataText.equals("25")) {
                fromDate.click();
                break;
            }
        }

        WebElement toCal = driver.findElement(By.id("calToDate"));
        toCal.click();
        WebElement monthToDD= driver.findElement(By.className("ui-datepicker-month"));
        Select select1 = new Select(monthToDD);
        select1.selectByValue("8");

        List<WebElement> toDates= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement toDate: toDates) {
            String dateText= toDate.getText();
            if(dateText.equals("4")) {
                toDate.click();
                break;
            }
        }
        WebElement rejectedCheckBox = driver.findElement(By.xpath("//input[@value='-1']"));
        rejectedCheckBox.click();
        WebElement canceledCheckBox = driver.findElement(By.xpath("//input[@value='0']"));
        canceledCheckBox.click();
        WebElement pendingCheckBox = driver.findElement(By.xpath("//input[@value='1']"));
        pendingCheckBox.click();

        WebElement subDD = driver.findElement(By.id("leaveList_cmbSubunit"));

        Select select2 = new Select(subDD);
        select2.selectByVisibleText("IT Support");
        WebElement searchBttn= driver.findElement(By.id("btnSearch"));
        searchBttn.click();
        driver.quit();

    }

}
