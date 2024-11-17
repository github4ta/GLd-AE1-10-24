package by.onliner.ui.pages.home;

import by.onliner.ui.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage() {
        driver = Driver.getDriver();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public String getTextFromAboutCompanyElement() {
        return getDriver().findElement(By.xpath(HomePageXpath.ABOUT_COMPANY_XPATH)).getText();
    }

    public HomePage clickEditorContacts() {
        getDriver().findElement(By.xpath(HomePageXpath.EDITOR_CONTACTS_XPATH)).click();
        return this;
    }
}
