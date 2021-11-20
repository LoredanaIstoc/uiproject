package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

public class LoginStepDef {
    LoginPage loginPage = new LoginPage();
    @Given("User is on th sport  page of BBC")
    public void user_is_on_th_sport_page_of_BBC() {
        Driver.get().get(ConfigurationReader.get("url"));
    }


    @When("User click on {string} module")
    public void user_click_on_module(String module) {
        BrowserUtils.waitFor(5);
        loginPage.SignInIcon.click();
    }
    @Then("User should be on Sign in page")
    public void user_should_be_on_Sign_in_page() {
        String result = Driver.get().getTitle();
        Assert.assertEquals("Sign in",result);
    }
    @When("User enter the unvalid  credentials {string} {string}")
    public void user_enter_the_unvalid_credentials(String Email , String Password) {
        System.out.println("pijh");
    }
    @When("User click on Sign in button")
    public void user_click_on_Sign_in_button() {
     loginPage.SignInBtn.click();
    }
    @Then("User should  not be  able to sign in")
    public void user_should_not_be_able_to_sign_in() {
        System.out.println("kjk");
    }
    @Then("The user get an error message")
    public void the_user_get_an_error_message() {
        System.out.println("kijuikhj");
    }
}
