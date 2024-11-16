package by.onliner.ui.pages.home;

import by.onliner.ui.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage() {
        driver = Driver.getDriver();
    }

    public String getTextEditorContacts() {
        return driver.findElement(By.xpath(HomePageXpath.EDITOR_CONTACTS_XPATH)).getText();
    }

    public HomePage clickLinkAdvertising() {
        driver.findElement(By.xpath(HomePageXpath.ADVERTISING_XPATH)).click();
        return this;
    }
}
