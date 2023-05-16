package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    LoginPage loginPage = new LoginPage();
    ProductPage productPage = new ProductPage();
    EmailAFriendPage emailAFriendPage = new EmailAFriendPage();
    @Given("I am on registration page")
    public void i_am_on_registration_page(){
        homePage.clickOnRegisterButton();
    }
    @When("I enter required registration details")
    public void i_enter_required_registration_details(){
        registerPage.enterRegistrationDetails();
    }
    @Then("I should able to register successfully")
    public void i_should_able_to_register_successfully(){
        registerResultPage.verifyUserRegisteredSuccessfully();
    }
    @Given("I am registered user")
    public void i_am_registered_user() {
        homePage.clickOnRegisterButton();
        registerPage.enterRegistrationDetails();
        registerResultPage.verifyUserRegisteredSuccessfully();
    }
    @Given("I am logged into my account")
    public void i_am_logged_into_my_account() {
        registerResultPage.clickOnLoginButton();
        loginPage.enterLoginDetails();
    }
    @Given("I am on homepage")
    public void i_am_on_homepage() {
        homePage.verifyYouAreOnHomePage();
    }
    @When("I click on Apple MacBook-{int} ADD TO CART Button")
    public void i_click_on_apple_mac_book_add_to_cart_button(Integer int1) {
        homePage.clickOnAppleMacBook();
    }
    @When("I am on product page")
    public void i_am_on_product_page() {
        productPage.verifyYouAreOnProductPage();
    }
    @When("I click on Email a friend button")
    public void i_click_on_email_a_friend_button() {
        productPage.clickOnEmailAFriend();
    }
    @Then("Email a friend page should appear")
    public void email_a_friend_page_should_appear() {
        emailAFriendPage.verifyEmailAFriendPageIsAppeared();
    }
    @Then("I enter required Email a friends Details")
    public void i_enter_required_email_a_friends_details() {
        emailAFriendPage.fillInFriendEmail();
    }
    @Then("I click on send email button")
    public void i_click_on_send_email_button() {
        emailAFriendPage.clickOnSendMessage();
    }
    @Then("A successfully sent email message should be displayed")
    public void a_successfully_sent_email_message_should_be_displayed() {
        emailAFriendPage.verifyMessageShouldBeSent();
    }






}
