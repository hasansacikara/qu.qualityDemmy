package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.N11Pages;
import pages.QualityDemmy;
import utilities.ConfigReader;
import utilities.Driver;

import javax.swing.plaf.basic.BasicSliderUI;

import java.security.Key;
import java.util.List;

import static utilities.Driver.driver;
import static utilities.Driver.getDriver;
//import static utilities.Driver.getDriver;

public class QualityDemmy1 {
    QualityDemmy qualityDemmy = new QualityDemmy();
    Actions action = new Actions(getDriver());

    Select select;

    public QualityDemmy1() {
        //select = new Select(WebElement());
    }

    //JavascriptExecutor js = (JavascriptExecutor) getDriver();

    //String orderId = "";
    //String status = "";
    //String orderDate = "";
    //String orderAmount = "";
    //Select select = new Select()


    @Given("qu.qualityDemmy sitesine gider")
    public void qu_quality_demmy_sitesine_gider() {
        getDriver().get(ConfigReader.getProperty("Url"));

    }


    @When("cokies click yapar")
    public void cokiesClickYapar() {
        qualityDemmy.cokiesButton.click();

    }

    @When("ilklogin butonuna click yapar")
    public void ilkloginButonunaClickYapar() {
        qualityDemmy.logInIlkText.click();
    }

    @When("email yazar")
    public void emailYazar() {
        qualityDemmy.loginEmail.sendKeys("bacefi1969@v3dev.com");
    }

    @When("passwor yazar")
    public void passworYazar() {
        qualityDemmy.loginPassword.sendKeys("Asd123123");
    }

    @When("login butanuna click yapar")
    public void loginButanunaClickYapar() {
        qualityDemmy.loginButton.click();
    }

    @When("basarili giris yapilir")
    public void basariliGirisYapilir() {
        //Assert.assertTrue(qualityDemmy.basariliGiris.isDisplayed());
        action.sendKeys(Keys.PAGE_DOWN).perform();


    }

    @When("Web desing textbox click yapar")
    public void webDesingTextboxClickYapar() {
        action.sendKeys(Keys.PAGE_DOWN).perform();
        qualityDemmy.WebDesingText.click();
        action.sendKeys(Keys.PAGE_DOWN).perform();

    }


    @When("Web pht click yapar")
    public void webPhtClickYapar() {
        action.sendKeys(Keys.PAGE_DOWN).perform();
        qualityDemmy.WebDesingTextPht.click();
        // action.sendKeys(Keys.PAGE_DOWN).perform();
        //action.sendKeys(Keys.PAGE_DOWN).perform();
    }


    @When("buynow click yapar")
    public void buynowClickYapar() {
        action.sendKeys(Keys.PAGE_DOWN).perform();
        qualityDemmy.buyNow.click();
        action.sendKeys(Keys.PAGE_DOWN).perform();

    }

    @When("checkout butonuna click yapar")
    public void checkoutButonunaClickYapar() {
        qualityDemmy.checkOutButonu.click();
    }

    @When("odeme yapilamadan cikis islemi yapar")
    public void odemeYapilamadanCikisIslemiYapar() {

    }

    @When("stripe textbox click yapar")
    public void stripeTextboxClickYapar() {
        qualityDemmy.stripetext.click();

    }

    @When("pat with click yapar")
    public void patWithClickYapar() {
        qualityDemmy.payWith.click();

    }

    @When("kart ödeme email yazar")
    public void kartOdemeEmailYazar() {
        qualityDemmy.kartEmail.sendKeys("bacefi1969@v3dev.com");

    }

    @When("kart nummber yazar")
    public void kartNummberYazar() {
        qualityDemmy.kartNumber.sendKeys("4242424242424242");

    }

    @When("kart tarih yazar")
    public void kartTarihYazar() {
        qualityDemmy.kartTarihi.sendKeys("01 / 30");

    }

    @When("kart Cvc yazar")
    public void kartCvcYazar() {
        qualityDemmy.kartCvc.sendKeys("123");

    }

    @When("kart ismi yazar")
    public void kartIsmiYazar() {
        qualityDemmy.kartIsmi.sendKeys("hasan");

    }

    @When("ülke secer")
    public void ulkeSecer() {
        select.getFirstSelectedOption().getCssValue("Türkiye");
        select.selectByIndex(20);
        // select.getAllSelectedOptions();
        // List<WebElement> ulkesecer = getDriver().findElements(By.xpath("//option[text()='Cayman Adaları']"));

    }


    @When("select ülke turkiye secer")
    public void selectUlkeTurkiyeSecer() {
        qualityDemmy.selectUlke.isSelected();
        qualityDemmy.selectUlke.click();

    }

    @When("checkbox odeme bilgilerine click yapar")
    public void checkboxOdemeBilgilerineClickYapar() {
        action.sendKeys(Keys.PAGE_DOWN).perform();
        qualityDemmy.checkBoxBilgi.click();
    }

    @When("number numarasi yazar")
    public void numberNumarasiYazar() {
       qualityDemmy.numberCheckbox.sendKeys("5384169055");

    }

    @When("submit buttonuna click yapar")
    public void submitButtonunaClickYapar() {
        action.sendKeys(Keys.PAGE_DOWN).perform();
        qualityDemmy.submitButton.click();


    }

}