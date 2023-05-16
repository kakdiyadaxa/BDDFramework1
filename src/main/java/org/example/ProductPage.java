package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ProductPage extends Utils {
    private By _emailFriend = By.xpath("//button[text()=\"Email a friend\"]");
    private By _productPageMessage = By.xpath("//h1[text()=\"Apple MacBook Pro 13-inch\"]");
    LoadProp loadProp = new LoadProp();

    public void verifyYouAreOnProductPage(){
        //print message
        String actualMessage = getTextFromElement(_productPageMessage);
        //print message
        System.out.println("My message " + actualMessage);
        Assert.assertEquals(actualMessage,loadProp.getProperty("getExpectedProductPageMsg"));
    }
    public void clickOnEmailAFriend(){
        //click on Email a friend
        clickOnElement(_emailFriend);
    }
}
