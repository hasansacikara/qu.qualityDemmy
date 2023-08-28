package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QualityDemmy {

    public QualityDemmy(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement logInIlkText;

    @FindBy (xpath = "//input[@id='login-email']")
    public WebElement loginEmail;

    @FindBy (xpath = "//input[@id='login-password']")
    public WebElement loginPassword;

    @FindBy(xpath = "(//*[text()='Login'])[2]")
    public WebElement loginButton;

    @FindBy(xpath = "//*[text()='Accept']")
    public WebElement cokiesButton;

    @FindBy (xpath = "//*[text()='Instructor']")
    public WebElement basariliGiris;

    @FindBy (xpath = "//a[@class='top-categories']")
    public WebElement WebDesingText;

    @FindBy (xpath = "(//a[@class='course-title'])[4]")
    public WebElement WebDesingTextPht;

    @FindBy (xpath = "//*[text()='Buy now']")
    public WebElement buyNow;

    @FindBy (xpath = "//*[text()='Checkout']")
    public WebElement checkOutButonu;

    @FindBy (xpath = "//i[@class='fa fa-times']")
    public WebElement cilisYapar;

    @FindBy (xpath = "//img[@class='payment-gateway-icon']")
    public WebElement stripetext;

    @FindBy (xpath = "//button[text()='Pay with stripe']")
    public WebElement payWith;

    @FindBy (xpath = "//input[@inputmode='email']")
    public WebElement kartEmail;

    @FindBy (xpath = "//input[@autocomplete='cc-number']")
    public WebElement kartNumber;

    @FindBy (xpath = "//*[@placeholder='AA / YY']")
    public WebElement kartTarihi;

    @FindBy (xpath = "//input[@name='cardCvc']")
    public WebElement kartCvc;

    @FindBy (xpath = "//input[@id='billingName']")
    public WebElement kartIsmi;

    @FindBy (xpath = "//div[@class='Select']")
    public WebElement ulkeSecer;

    @FindBy (xpath = "//option[text()='Cayman Adaları']")
    public WebElement selectUlke;

    @FindBy (xpath = "(//input[@class='Checkbox-Input'])[2]")
    public WebElement checkBoxBilgi;

    @FindBy (xpath = "//input[@name='phoneNumber']")
    public WebElement numberCheckbox;

    @FindBy (xpath = "//div[@class='SubmitButton-IconContainer']")
    public WebElement submitButton;















}
