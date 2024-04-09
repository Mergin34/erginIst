package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {
    public FacebookPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")
    public WebElement create;
    @FindBy(xpath = "//*[@name='websubmit']")
    public WebElement signInButton;
    @FindBy(xpath = "//*[@name='firstname']")
    public WebElement name;
    @FindBy(xpath = "(//*[@class='_5k_2 _5dba'])[2]")
    public WebElement male;
    @FindBy(xpath = "//*[@id='email']")
    public WebElement email;
}
