package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils{
    private By _registerButton = By.className("ico-register");
    private By _loginButton = By.xpath("//a[text()='Log in' ]");
    private By _digitalDownloads = By.xpath("//img[@alt='Picture for category Digital downloads']");

    public void clickOnRegisterButton() {
        //click on register link
        clickOnElement(_registerButton);
    }
    public void clickOnLoginButton(){
        //click on log in button
        clickOnElement(_loginButton);

    }
    public void clickOnDigitalDownload(){
        // click on digital download link
        clickOnElement(_digitalDownloads);
    }
}
