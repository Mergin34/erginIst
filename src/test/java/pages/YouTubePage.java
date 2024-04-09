package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class YouTubePage {
    public YouTubePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//*[@id='logo-icon'])[1]")
    public WebElement logo;
    @FindBy(xpath = "//*[@name='search_query']")
    public WebElement searchBox;
}
