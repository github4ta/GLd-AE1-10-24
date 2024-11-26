package by.onliner.ui.pages.home;

import by.onliner.ui.driver.Driver;
import by.onliner.ui.utils.socialMediaMethods.SocialMediaUrl;
import org.apache.commons.exec.ExecuteException;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

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

    public void clickHousesAndFlatsLink() {
        driver.findElement(By.xpath(HomePageXpath.HOUSES_AND_FLATS_XPATH)).click();
    }

    public SocialMediaUrl clickVkLink() {
        driver.findElement(By.xpath(HomePageXpath.COOKIE_SUBMIT_BUTTON_XPATH)).click();
        int maxRetry = 2;
        for (int i = 0; i < maxRetry; i++) {
            try {
                WebElement element = driver.findElement(By.xpath(HomePageXpath.VK_BUTTON_XPATH));
                element.click();
                break;
            } catch (StaleElementReferenceException e) {
                if (i == maxRetry - 1) throw e;
            }
        }
        return new SocialMediaUrl(Driver.getDriver());
    }

    public SocialMediaUrl clickFaceBookLink() {
        driver.findElement(By.xpath(HomePageXpath.COOKIE_SUBMIT_BUTTON_XPATH)).click();
        int maxRetry = 2;
        for (int i = 0; i < maxRetry; i++) {
            try {
                WebElement element = driver.findElement(By.xpath(HomePageXpath.FACEBOOK_BUTTON_XPATH));
                element.click();
                break;
            } catch (StaleElementReferenceException e) {
                if (i == maxRetry - 1) throw e;
            }
        }
        return new SocialMediaUrl(getDriver());
    }

    public SocialMediaUrl clickTwitterLink() {
        driver.findElement(By.xpath(HomePageXpath.COOKIE_SUBMIT_BUTTON_XPATH)).click();
        int maxRetry = 2;
        for (int i = 0; i < maxRetry; i++) {
            try {
                WebElement element = driver.findElement(By.xpath(HomePageXpath.TWITTER_BUTTON_XPATH));
                element.click();
                break;
            } catch (StaleElementReferenceException e) {
                if (i == maxRetry - 1) throw e;
            }
        }
        return new SocialMediaUrl(getDriver());
    }

    public SocialMediaUrl clickYouTubeLink() {
        driver.findElement(By.xpath(HomePageXpath.COOKIE_SUBMIT_BUTTON_XPATH)).click();
        int maxRetry = 2;
        for (int i = 0; i < maxRetry; i++) {
            try {
                WebElement element = driver.findElement(By.xpath(HomePageXpath.YOUTUBE_BUTTON_XPATH));
                element.click();
                break;
            } catch (StaleElementReferenceException e) {
                if (i == maxRetry - 1) throw e;
            }
        }
        return new SocialMediaUrl(getDriver());
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

    public HomePage clickLinkBaraholca() {
        driver.findElement(By.xpath(HomePageXpath.BARAKHOLKA_XPATH)).click();
        return this;
    }

    public String getCurrentUrl() {
        return  driver.getCurrentUrl();
    }
}
