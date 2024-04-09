package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {
    public AmazonPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBox;
    @FindBy(xpath = "//*[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement searchResults;
    @FindBy(xpath = "(//*[@class='s-image'])[1]")
    public WebElement firstResult;
    @FindBy(css = "#nav-link-accountList")
    public WebElement accountList;
    @FindBy(xpath = "//*[text()='Create a Wish List']")
    public WebElement createWishList;
    @FindBy(xpath = "//*[@id='my-lists-tab']")
    public WebElement yourList;
    @FindBy(xpath = "(//*[@class='sg-col-inner'])[1]")
    public WebElement resultPageForSamsungA71;
    @FindBy(xpath = "//*[@class='navFooterBackToTopText']")
    public WebElement backToTop;
}