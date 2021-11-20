package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Dashboard {
    public Dashboard(){
        PageFactory.initElements(Driver.get(),this);
    }
    @FindBy (css = "#se-searchbox-input-field")
    public WebElement searchBox;

    @FindBy( xpath = "//button[@type= \"submit\"]")
    public WebElement Btnsearch;


}
