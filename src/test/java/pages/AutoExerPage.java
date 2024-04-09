package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutoExerPage {
    public AutoExerPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()=' Signup / Login']")
    public WebElement loginSignup;
    @FindBy(xpath = "//*[@type='text']")
    public WebElement signUpname;
    @FindBy(xpath = "(//*[@type='email'])[2]")
    public WebElement signUpMail;
    @FindBy(xpath = "//*[@id='id_gender1']")
    public WebElement genderMr;
    @FindBy(xpath = "//*[@id='first_name']")
    public WebElement firstName;
    @FindBy(xpath = "(//*[@type='email'])[1]")
    public WebElement loginEmail;
    @FindBy(xpath = "(//*[@type='password'])[1]")
    public WebElement loginPassword;
    @FindBy(xpath = "//*[text()='Login to your account']")
    public WebElement loginYourAccountText;
    @FindBy(xpath = "//*[text()=' Logged in as ']")
    public WebElement loginInAs_UserName;
    @FindBy(xpath = "//*[text()=' Logout']")
    public WebElement logout;
    @FindBy(xpath = "//*[text()='New User Signup!']")
    public WebElement newUserSignUpText;
    @FindBy(xpath = "//*[@style='color: red;']")
    public WebElement yourEmailAdressAlExText;
    @FindBy(xpath = "//*[text()=' Contact us']")
    public WebElement contactUs;
    @FindBy(xpath = "(//*[@class='title text-center'])[2]")
    public WebElement getInTouchContactUsText;
    @FindBy(xpath = "//*[@name='name']")
    public WebElement contactUsName;
    @FindBy(xpath = "//*[@name='email']")
    public WebElement contactUsEmail;
    @FindBy(xpath = "//*[@name='subject']")
    public WebElement contactUsSubject;
    @FindBy(xpath = "//*[@name='message']")
    public WebElement contactUsMessage;
    @FindBy(xpath = "//*[@name='submit']")
    public WebElement contactUsSubmit;
    @FindBy(xpath = "//*[@name='upload_file']")
    public WebElement contactUsChoicesFile;
    @FindBy(xpath = "//*[@class='status alert alert-success']")
    public WebElement contactUsSuccText;
    @FindBy(xpath = "//*[@class='title text-center']")
    public WebElement allProductsText;
    @FindBy(xpath = "(//*[text()=' Home'])[2]")
    public WebElement contactUsHome;
    @FindBy(xpath = "//*[text()=' Test Cases']")
    public WebElement testCases;
    @FindBy(xpath = "//*[text()=' Products']")
    public WebElement products;
    @FindBy(xpath = "(//*[text()='View Product'])[1]")
    public WebElement viewProductsInFirst;
    @FindBy(xpath = "//*[@id='search_product']")
    public WebElement searchProductButton;
    @FindBy(xpath = "//*[@class='title text-center']")
    public WebElement searchProductText;
    @FindBy(xpath = "//*[text()='Subscription']")
    public WebElement subscription;
    @FindBy(xpath = "//*[@id='susbscribe_email']")
    public WebElement subscriptionYourEmailAddresses;
    @FindBy(xpath = "//*[text()=' Cart']")
    public WebElement cartButton;
    @FindBy(xpath = "//*[@type='button']")
    public WebElement addToCart;
    @FindBy(xpath = "(//*[text()='Add to cart'])[1]")
    public WebElement inProductsFirstAddTheCart;
    @FindBy(xpath = "(//*[text()='Add to cart'])[3]")
    public WebElement inProductsSecondAddTheCart;
    @FindBy(xpath = "//*[text()='Continue Shopping']")
    public WebElement continueShopping;
    @FindBy(xpath = "//*[text()='View Cart']")
    public WebElement viewCartButton;
    @FindBy(xpath = "//*[@id='quantity']")
    public WebElement productQuantity;
    @FindBy(xpath = "//*[text()='Proceed To Checkout']")
    public WebElement proToCheckout;
    @FindBy(xpath = "//*[text()='Register / Login']")
    public WebElement registerLogin;
    @FindBy(xpath = "//*[text()='Continue']")
    public WebElement continueButton;
    @FindBy(xpath = "//*[@class='form-control']")
    public WebElement descriptionArea;
    @FindBy(xpath = "//*[text()='Place Order']")
    public WebElement placeOrder;
    @FindBy(xpath = "//*[@class='form-control']")
    public WebElement nameOfCard;
    @FindBy(xpath = "//*[text()=' Delete Account']")
    public WebElement deleteAccount;
    @FindBy(xpath = "//*[@class='fa fa-times']")
    public WebElement removeProduct;
    @FindBy(xpath = "(//*[@class='title text-center'])[2]")
    public WebElement recomendedItem;
    @FindBy(xpath = "//*[text()=' Home']")
    public WebElement homeButton;
}
