package by.onliner.ui.pages.home;

import by.onliner.ui.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdvertisingPage {

    private WebDriver driver;

    public AdvertisingPage(){
        driver = Driver.getDriver();
    }

    public AdvertisingPage(WebDriver driver){
        this.driver = driver;
    }

    public static String getUrl(){
        return "https://b2breg.onliner.by/advertising";
    }

    public String getTitle(){
        return driver.findElement(By.xpath(AdvertisingPageXpath.TITLE)).getText();
    }
}
