package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterResultPage extends Utils{
    LoadProp loadProp = new LoadProp();


    private By _actualMassage = By.xpath("//div[@class='result']");



    public void verifyToUserShouldRegisterSuccessfully() {
        // get the massage
        String actualMassage = getTextFromElement(_actualMassage);

        //for match 2 result
        Assert.assertEquals(actualMassage,loadProp.getProperty("registrationcompleteMessage"));


    }
}
