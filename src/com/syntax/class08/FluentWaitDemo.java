package com.syntax.class08;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class FluentWaitDemo {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver(); // this will launch the browser

        // we crate an object of wait interface
        // driver is point of execution in this example
        // driver is an object of WebDriver
        // in side the wait object creation we pass the WebDriver because driver is an object of WebDriver


        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(5))
                //putting a time-out so if something doesn't happen in 5 seconds show the error in console
                .pollingEvery(Duration.ofSeconds(5))
                // polling means when you try to locate the element, and you have implicit wait for 10  secs-
                // implicit will look for the element in every half second again and again
                // when se set polling to 5 seconds it means that it will look for an element every 5 seconds
                // every 5 seconds if it doesn't find the element it will go stop and look again after it takes a rest
                // -- look for an element every 5 seconds, generally without this it looks for an element every half second
                // but by using this pollingEvery it will look for the element every 5 seconds
                .ignoring(NoSuchElementException.class);
                 // ignores the exception mentioned in the given time
                // if the wait is 20 seconds this exeption will not occur in that time, but once the time is off it will throw the exeption if it is still here



    }
}
