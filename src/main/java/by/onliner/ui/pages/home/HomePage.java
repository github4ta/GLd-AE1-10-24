package by.onliner.ui.pages.home;

import by.onliner.ui.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage() {
        driver = Driver.getDriver();
    }

    public String getTextAdvertisingLink() {
        return driver.findElement(By.xpath(HomePageXpath.ADVERTISING_LINK_XPATH)).getText();
    }

    public HomePage clickTariffsLink() {
        driver.findElement(By.xpath(HomePageXpath.TARIFFS_LINK_XPATH)).click();
        return this;
    }
}
