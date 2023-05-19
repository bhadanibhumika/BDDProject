package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DriverManager extends Utils {
    LoadProp loadProp = new LoadProp();
    String browserName = loadProp.getProperty("browser");


    public void openBrowser() {
       if (browserName.equalsIgnoreCase("Chrome"))
       {
           driver=new ChromeDriver();
       }
       else if (browserName.equalsIgnoreCase("firefox"))
       {
           driver = new FirefoxDriver();
       }
       else if (browserName.equalsIgnoreCase("edge"))
       {
          driver = new EdgeDriver();
       }
       else
       {
            System.out.println("Your browser name is wrong or not implemented ;" + browserName);
       }
        //type url
        driver.get(loadProp.getProperty("url"));

        //wait for 10 second
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //for window maximize
        driver.manage().window().maximize();
    }

    public void closeBrowser() {
        //close browser
        driver.close();
    }

}
