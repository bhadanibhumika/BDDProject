package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class Utils extends BasePage{
    //reusable method
    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }
    public static void typeText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }
    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }
    public static long timestamp() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp.getTime();
    }
    public static void selectElementByValue(By by, String value) {

        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }
    public static void selectElementByText(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }
    public static void selectElementByIndex(By by, int index) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);

    }
    public static void waitForClickable(By by, int timeInSec) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSec));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    public static String getCurrentURL() {
        return driver.getCurrentUrl();

    }

    public static String getWindowHandle() {
        return driver.getWindowHandle();
    }
    public static String currentTimesStamp() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyhhmmss");
        return sdf.format(date);
    }

}
