package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ProductPage extends Utils{
    LoadProp loadProp = new LoadProp();
    private By _addToCartButton = By.xpath("//div[@class=\"item-grid\"]/div[1]/div/div[2]/div[3]/div[2]/button[1]");

    private  By _emailAFriendButton = By.xpath("//div[@class='email-a-friend']");
    private By _enterFriendEmail = By.xpath("//input[contains(@class,'friend-email')]");
    private By _enterMassage = By.xpath("//textarea[starts-with(@name,'Personal')]");
    private  By _clickOnSendEmailButton = By.name("send-email");
    private  By _emailSentMessage = By.xpath("//div[@class=\"result\"]");
    private By _emailAFriendPAgeTitle = By.xpath("//h1[text()='Email a friend']");




    public void clickOnLondonGrammerBook() {
        //click on add to cart
        clickOnElement(_addToCartButton);
    }
    public void verifyProductPage(){
        String actualProductpageURL=getCurrentURL();
        Assert.assertEquals(actualProductpageURL,loadProp.getProperty("productPageUrl"));

    }
    public  void clickOnEmailAFriend(){
        //click on email a friend button
        clickOnElement(_emailAFriendButton);
    }
    public void verifyEmailAFriendPage(){
        //verify page title
        String actualTitle = getTextFromElement(_emailAFriendPAgeTitle);
        Assert.assertEquals(actualTitle,loadProp.getProperty("emailAFriendPageTitle"));

    }
    public void fillInEmailAFriendDetailsForRegisteredUser(){
        //type friend email
        typeText(_enterFriendEmail,loadProp.getProperty("friendemail")+loadProp.getProperty("emailDomain"));
        //type message
        typeText(_enterMassage,loadProp.getProperty("personalMessage"));

    }
    public void clickOnSendEmail(){
        //click on send email button
        clickOnElement(_clickOnSendEmailButton);
    }
    public void emailSentSuccessfullyMessage(){
        //get  email sent message
       String  actualMessage = getTextFromElement(_emailSentMessage);
        Assert.assertEquals(actualMessage,loadProp.getProperty("sentEmailsuccessfullyMessage"));

    }



}
