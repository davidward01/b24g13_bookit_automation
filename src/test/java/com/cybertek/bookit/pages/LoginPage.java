package com.cybertek.bookit.pages;

import com.cybertek.bookit.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class LoginPage extends BasePage{

    @FindBy(name = "email")
    public WebElement usernameField;

    @FindBy(name = "password")
    public WebElement passwordField;

    @FindBy(xpath= "//button[.='sign in']")
    public WebElement signInBtn;

    @FindBy(xpath = "//h1[.='sign in']")
    public WebElement signInH1;

    public void login(String username, String password){
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        signInBtn.click();
    }

}
