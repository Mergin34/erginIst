package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BlueRentalCarPage {
    public BlueRentalCarPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = ("//*[@class='btn btn-primary btn-sm']"))
    public WebElement loginButton;
    @FindBy(xpath =("//*[@id='formBasicEmail']"))
    public WebElement emailBox;
    @FindBy(xpath = "//*[@id='dropdown-basic-button']")
    public WebElement successEntryButton;
    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement secondPagelogin;
}
