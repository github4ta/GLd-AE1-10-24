package by.onliner.ui.pages.home;

import by.onliner.ui.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage() {
        driver = Driver.getDriver();
    }

    public String getTariffsFooterLinkText() {
        return driver.findElement(By.xpath(HomePageXpath.TARIFFS_LINK_XPATH)).getText();
    }

    public HomePage clickVacanciesFooterLink() {
        driver.findElement(By.xpath(HomePageXpath.VACANCIES_LINK_XPATH)).click();
        return this;
    }

    public String getSiteRulesLinkText() {
        return driver.findElement(By.xpath(HomePageXpath.USER_AGREEMENT_LINK_XPATH)).getText();
    }

    public String getTextAdvertisingLink() {
        return driver.findElement(By.xpath(HomePageXpath.ADVERTISING_LINK_XPATH)).getText();
    }

    public String getVacanciesLinkText() {
        return driver.findElement(By.xpath(HomePageXpath.VACANCIES_LINK_XPATH)).getText();
    }

    public String getTextEditorContacts() {
        return driver.findElement(By.xpath(HomePageXpath.EDITOR_CONTACTS_LINK_XPATH)).getText();
    }

    public String getTextManifest() {
        return driver.findElement(By.xpath(HomePageXpath.MANIFEST_LINK_XPATH)).getText();
    }

    public String getTextUserSupportLink() {
        return driver.findElement(By.xpath(HomePageXpath.FOOTER_LINK_USER_SUPPORT_XPATH)).getText();
    }

    public HomePage clickLinkUserAgreement() {
        driver.findElement(By.xpath(HomePageXpath.USER_AGREEMENT_LINK_XPATH)).click();
        return this;
    }

    public HomePage clickReturnPolicyLink() {
        driver.findElement(By.xpath(HomePageXpath.FOOTER_LINK_RETURN_POLICY_XPATH)).click();
        return this;
    }

    public HomePage clickLinkPublicContracts() {
        driver.findElement(By.xpath(HomePageXpath.PUBLIC_CONTRACTS_LINK_XPATH)).click();
        return this;
    }

    public HomePage clickTariffsLink() {
        driver.findElement(By.xpath(HomePageXpath.TARIFFS_LINK_XPATH)).click();
        return this;
    }

    public void clickManifestLink() {
        driver.findElement(By.xpath(HomePageXpath.MANIFEST_LINK_XPATH)).click();
    }

    public AdvertisingPage clickLinkAdvertising() {
        driver.findElement(By.xpath(HomePageXpath.ADVERTISING_LINK_XPATH)).click();
        return new AdvertisingPage(this.driver);
    }

    public String getTextFromAboutCompanyElement() {
        return getDriver().findElement(By.xpath(HomePageXpath.ABOUT_COMPANY_LINK_XPATH)).getText();
    }

    public HomePage clickEditorContacts() {
        getDriver().findElement(By.xpath(HomePageXpath.EDITOR_CONTACTS_LINK_XPATH)).click();
        return this;
    }

    public void clickAboutCompanyLink() {
        driver.findElement(By.xpath(HomePageXpath.ABOUT_COMPANY_LINK_XPATH)).click();
    }

    public String getTextReturnPolicy() {
        return driver.findElement(By.xpath(HomePageXpath.FOOTER_LINK_RETURN_POLICY_XPATH)).getText();
    }

    public String getTextPublicContracts() {
        return driver.findElement(By.xpath(HomePageXpath.PUBLIC_CONTRACTS_LINK_XPATH)).getText();
    }

    public HomePage clickLinkPersonalDataProcessingPolicy() {
        driver.findElement(By.xpath(HomePageXpath.FOOTER_LINK_PERSONAL_DATA_PROCESSING_POLICY_XPATH)).click();
        return this;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public String getTextPersonalDataProcessingPolicy(){
        return getDriver().findElement(By.xpath(HomePageXpath.FOOTER_LINK_PERSONAL_DATA_PROCESSING_POLICY_XPATH)).getText();
    }

    public HomePage clickLinkUserSupport() {
        driver.findElement(By.xpath(HomePageXpath.FOOTER_LINK_USER_SUPPORT_XPATH)).click();
        return this;
    }

    public HomePage clickLinkForum() {
        driver.findElement(By.xpath(HomePageXpath.FORUM_XPATH)).click();
        return this;
    }

    public String getTextForum(){
        return driver.findElement(By.xpath(HomePageXpath.FORUM_TEXT_XPATH)).getText();
    }


    public String getTextSupportUser() {
        return getDriver().findElement(By.xpath(HomePageXpath.FOOTER_LINK_USER_SUPPORT_XPATH)).getText();
    }

    public HomePage clickLinkCatalog() {
        driver.findElement(By.xpath(HomePageXpath.CATALOG_XPATH)).click();
        return this;
    }
}
