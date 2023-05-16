package org.example;

import org.openqa.selenium.By;

public class RegisterPage extends Utils{
    private By _firstName = By.xpath("//input[@id=\"FirstName\"]");
    private By _lastName = By.xpath("//input[@id=\"LastName\"]");
    private By _email = By.xpath("//input[@id=\"Email\"]");
    private By _password = By.xpath("//input[@id=\"Password\"]");
    private By _confirmPassword = By.xpath("//input[@id=\"ConfirmPassword\"]");
    private By _clickOnRegisterButton = By.xpath("//button[@name=\"register-button\"]");
    private By _day_DateOfBirth = By.xpath("//select[@name=\"DateOfBirthDay\"]");
    private By _month_DateOfBirth = By.xpath("//select[@name=\"DateOfBirthMonth\"]");
    private By _year_DateOfBirth = By.xpath("//select[@name=\"DateOfBirthYear\"]");

    LoadProp loadProp = new LoadProp();
    public void enterRegistrationDetails(){

        //type firstname
        typeText(_firstName,loadProp.getProperty("firstName"));
        //type lastname
        typeText(_lastName,loadProp.getProperty("lastName"));

        //select dropdown for integer day
        selectOptionsByValue(_day_DateOfBirth,loadProp.getProperty("day_DateOfBirth"));
        //select dropdown month text
        selectOptionsByValue(_month_DateOfBirth,loadProp.getProperty("month_DateOfBirth"));
        //select dropdown year value
        selectOptionsByText(_year_DateOfBirth,loadProp.getProperty("year_DateOfBirth"));

        //type email address
        typeText(_email,loadProp.getProperty("email")+timeStamp+loadProp.getProperty("emailDomain"));
        //type password
        typeText(_password,loadProp.getProperty("password"));
        //type confirm password
        typeText(_confirmPassword,loadProp.getProperty("confirmPassword"));
        //click on register button
        clickOnElement(_clickOnRegisterButton);

    }

}
