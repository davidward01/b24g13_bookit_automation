package com.cybertek.bookit.step_definitions;

import com.cybertek.bookit.pages.HomePage;
import com.cybertek.bookit.pages.LoginPage;
import com.cybertek.bookit.utilities.ConfigurationReader;
import com.cybertek.bookit.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("bookit_url"));
        Assert.assertTrue("FAIL: sign in H1 is not visible", loginPage.signInH1.isDisplayed());
    }

    @When("I enter valid username {string} and password {string} login credentials")
    public void i_enter_valid_username_and_password_login_credentials(String string, String string2) {
        loginPage.login(string,string2);
    }

    @Then("I should be on the home page")
    public void i_should_be_on_the_home_page() {
        Assert.assertTrue("FAIL: map text is not visible", homePage.mapH1.isDisplayed());
    }

}
