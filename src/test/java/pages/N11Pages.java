package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class N11Pages {

    public N11Pages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[text()='Üye Ol']")
    public WebElement uyeOl;

    @FindBy (xpath = "//input[@id='firstName']")
    public WebElement firstNameText;

    @FindBy (xpath = "//input[@id='lastName']")
    public WebElement lastNameText;

    @FindBy (xpath = "//input[@name='email']")
    public WebElement emailText;

    @FindBy (xpath = "//input[@name='password']")
    public WebElement passwordText;

    @FindBy (xpath = "//input[@name='passwordAgain']")
    public WebElement passwordAgainText;

    @FindBy (xpath = "//select[@id='countryCode']")
    public WebElement countryCodeText;

    @FindBy (xpath = "//option[@value='+90']")
    public WebElement optionNumberText;

    @FindBy (xpath = "//div[@class='inputFieldPhone']")
    public WebElement optionMobilePhoneText;

    @FindBy (xpath = "//span[@class='checkmark'][1]")
    public WebElement checkmarkErkek;

    @FindBy (xpath = "//select[@id='birthDay']")
    public WebElement birthDayText;

    @FindBy (xpath = "//select[@id='birthMonth']")
    public WebElement birthMonthText;

    @FindBy (xpath = "//select[@id='birthYear']")
    public WebElement birthYearText;

    @FindBy (xpath = "//option[@value='1992']")
    public WebElement birthYearselectText;

    @FindBy (xpath = "//label[@for='acceptContract']")
    public WebElement acceptUyeSozlesmecheckbox;

    @FindBy (xpath = "//label[@for='sendPromotionalMailAndSms']")
    public WebElement sendPromotionalMailcheckbox;

    @FindBy (xpath = "//div[@id='submitButton']")
    public WebElement submitButton;






}
