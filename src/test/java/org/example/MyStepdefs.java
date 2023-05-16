package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    HomePage homePage = new HomePage();
    RegisterPage registerPage =new RegisterPage();
    RegisterResultPage  registerResultPage = new RegisterResultPage();
    LogInPage logInPage = new LogInPage();
    ProductPage productPage = new ProductPage();

    @Given("I am on registration page")
    public void i_am_on_registration_page() {
        homePage.clickOnRegisterButton();

    }
    @When("I enter required registration details")
    public void i_enter_required_registration_details() {
        registerPage.enterRegistrationDetails();

    }
    @Then("I should Able to register successfully")
    public void i_should_able_to_register_successfully() {
        registerResultPage.verifyToUserShouldRegisterSuccessfully();

    }
    @Given("I am a registered user")
    public void i_am_a_registered_user() {
      homePage.clickOnRegisterButton();
      registerPage.enter_registrationDetailsForAlreadyRegisteredUser();
    }
    @Given("I am logged in to my account")
    public void i_am_logged_in_to_my_account() {
        homePage.clickOnLoginButton();
        logInPage.enterLogInDetails();


    }
    @Given("I am on the homepage page")
    public void i_am_on_the_homepage_page() {
        homePage.verifyHomePage();

    }
    @When("I click on digital downloads")
    public void i_click_on_digital_downloads() {
        homePage.clickOnDigitalDownload();


    }
    @When("I click on LONDON GRAMMAR add to cart button")
    public void i_click_on_london_grammar_add_to_cart_button() {
        productPage.clickOnLondonGrammerBook();


    }
    @When("I am on product page")
    public void i_am_on_product_page() {
        productPage.verifyProductPage();


    }
    @When("I click on the Email A friend button")
    public void i_click_on_the_email_a_friend_button() {
        productPage.clickOnEmailAFriend();

    }
    @Then("Email a friend page should appear")
    public void email_a_friend_page_should_appear() {
        productPage.verifyEmailAFriendPage();

    }
    @Then("I enter Friend Email details")
    public void i_enter_friend_email_details() {
        productPage.fillInEmailAFriendDetailsForRegisteredUser();


    }
    @Then("I click on Send Email")
    public void i_click_on_send_email() {
        productPage.clickOnSendEmail();

    }
    @Then("A successfully sent email message should be displayed")
    public void a_successfully_sent_email_message_should_be_displayed() {
        productPage.emailSentSuccessfullyMessage();

    }



}
