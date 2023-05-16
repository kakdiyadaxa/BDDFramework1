package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends Utils{
    private By _registerButton = By.xpath("//a[@class=\"ico-register\"]");
    private By _appleMacBook = By.xpath("//a[text()=\"Apple MacBook Pro 13-inch\"]");
    private By _homePageMessage = By.xpath("//h2[text()=\"Welcome to our store\"]");
    LoadProp loadProp = new LoadProp();
    public void clickOnRegisterButton(){
        //click on register button
        clickOnElement(_registerButton);
    }
    public void clickOnAppleMacBook(){
        //click On Apple MacBook
        clickOnElement(_appleMacBook);
    }
    public void verifyYouAreOnHomePage(){
        //print message
        String actualMessage = getTextFromElement(_homePageMessage);
        //print message
        System.out.println("My message " + actualMessage);
        Assert.assertEquals(actualMessage,loadProp.getProperty("getExpectedHomePageMsg"));
    }

}
