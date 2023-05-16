package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class EmailAFriendPage extends Utils{
    private By _friendEmail = By.xpath("//input[@class=\"friend-email\"]");
    private By _personalMessage = By.xpath("//textarea[@class=\"your-email\"]");
    private By _sendEmail = By.xpath("//button[@name=\"send-email\"]");
    private By _emailMessage = By.xpath("//div[@class=\"result\"]");
    private By _emailAFriendPageMessage = By.xpath("//h1[text()=\"Email a friend\"]");
    LoadProp loadProp = new LoadProp();
    public void verifyEmailAFriendPageIsAppeared(){
        //print out message
        String actualMessage = getTextFromElement(_emailAFriendPageMessage);
        System.out.println("My Message: "+actualMessage);
        Assert.assertEquals(actualMessage,loadProp.getProperty("getExpectedEmailAFriendPageMessage"));
    }
    public void fillInFriendEmail(){
        //enter friend email
        typeText(_friendEmail,loadProp.getProperty("friendEmail"));
        //enter message
        typeText(_personalMessage,loadProp.getProperty("personalMessage"));
    }
    public void clickOnSendMessage(){
        //click on send email
        clickOnElement(_sendEmail);
    }
    public void verifyMessageShouldBeSent(){
        //print out message
        String actualMessage = getTextFromElement(_emailMessage);
        System.out.println("My Message: "+actualMessage);
        Assert.assertEquals(actualMessage,loadProp.getProperty("getExpectedSendEmailMessage"));
    }

}
