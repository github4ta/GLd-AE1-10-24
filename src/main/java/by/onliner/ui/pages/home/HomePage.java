package by.onliner.ui.pages.home;

import by.onliner.ui.driver.Driver;
import by.onliner.ui.pages.login.LoginPageXpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage() {
        driver = Driver.getDriver();
    }

    public String getTariffsFooterLinkText(){
        return driver.findElement(By.xpath(HomePageXpath.TARIFFS_XPATH)).getText();
    }

    public HomePage clickVacanciesFooterLink(){
        driver.findElement(By.xpath(HomePageXpath.VACANCIES_XPATH)).click();
        return this;
    }

    public String getSiteRulesLinkText() {
        return driver.findElement(By.xpath(HomePageXpath.USER_AGREEMENT_XPATH)).getText();
    }

    public HomePage clickLinkPublicContracts() {
        driver.findElement(By.xpath(HomePageXpath.PUBLIC_CONTRACTS_XPATH)).click();
        return this;
    }

    public String getTextAdvertisingLink() {
        return driver.findElement(By.xpath(HomePageXpath.ADVERTISING_LINK_XPATH)).getText();
    }

    public String getVacanciesLinkText() {
        return driver.findElement(By.xpath(HomePageXpath.VACANCIES_LINK_XPATH)).getText();
    }

    public HomePage clickTariffsLink() {
        driver.findElement(By.xpath(HomePageXpath.TARIFFS_LINK_XPATH)).click();
        return this;
    }

    public void clickManifestLink() {
        driver.findElement(By.xpath(HomePageXpath.MANIFEST_LINK_XPATH)).click();
    }

    public String getTextEditorContacts() {
        return driver.findElement(By.xpath(HomePageXpath.EDITOR_CONTACTS_LINK_XPATH)).getText();
    }

    public HomePage clickLinkAdvertising() {
        driver.findElement(By.xpath(HomePageXpath.ADVERTISING_LINK_XPATH)).click();
        return this;
    }

    public String getTextManifest() {
        return driver.findElement(By.xpath(HomePageXpath.MANIFEST_LINK_XPATH)).getText();
    }

    public HomePage clickLinkUserAgreement() {
        driver.findElement(By.xpath(HomePageXpath.USER_AGREEMENT_LINK_XPATH)).click();
    }
}
