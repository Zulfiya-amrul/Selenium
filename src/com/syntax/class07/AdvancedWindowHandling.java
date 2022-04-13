package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class AdvancedWindowHandling {
    public static String url = "https://syntaxprojects.com/window-popup-modal-demo.php";

    /*
    click on buttons and open new windows (Tabs)
    switch to windows and perform different actions
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String mainPageHandle= driver.getWindowHandle();
        WebElement igButton= driver.findElement(By.linkText("Follow On Instagram"));
        WebElement fbButton= driver.findElement(By.linkText("Like us On Facebook"));
        WebElement igAndFbButton= driver.findElement(By.linkText("Follow Instagram & Facebook"));
        igButton.click();;
        fbButton.click();
        igAndFbButton.click();

        Set<String> allWindowHandles= driver.getWindowHandles();
        System.out.println(allWindowHandles);
        Iterator<String> it= allWindowHandles.iterator();
        while (it.hasNext()) {
            String handle = it.next();
            if (!mainPageHandle.equals(handle)){
                driver.switchTo().window(handle);
                String title = driver.getTitle();
                System.out.println(title);
                driver.close();

            }
         /*   driver.switchTo().window(handle);
            driver.manage().window().maximize();
            String title = driver.getTitle();
            System.out.println(title);
*/

        }
        driver.switchTo().window(mainPageHandle);
        igButton.click();;


    }
}
