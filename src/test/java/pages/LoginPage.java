package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage extends Dashboard{
    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }
    @FindBy (css = "#user-identifier-input")
    public WebElement emailField;

    @FindBy(css = "#password-input")
    public WebElement passwordField;

    @FindBy(css = "#submit-button")
    public WebElement SignInBtn;

    @FindBy(css = "#idcta-statusbar")
    public WebElement SignInIcon;


    @FindBy(css = "#form-message-general")
    public WebElement errorMessage;
}
