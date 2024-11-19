package by.onliner.ui.pages.home;

import by.onliner.ui.driver.Driver;
import org.openqa.selenium.WebDriver;

public class AdvertisingPage {

    private WebDriver driver;

    public AdvertisingPage(){
        driver = Driver.getDriver();
    }

    public AdvertisingPage(WebDriver driver){
        this.driver = driver;
    }
}
