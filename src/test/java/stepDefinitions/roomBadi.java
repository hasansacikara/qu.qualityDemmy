package stepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.interactions.Actions;
import pages.Roombadi;
import utilities.ConfigReader;

import static utilities.Driver.getDriver;

public class roomBadi {

    Roombadi roombadi =new Roombadi();

    Actions action = new Actions(getDriver());

    @Given("Kullanici roomBadi sitesine gider")
    public void kullanici_room_badi_sitesine_gider() {
        getDriver().get(ConfigReader.getProperty("Url2"));
    }




}
