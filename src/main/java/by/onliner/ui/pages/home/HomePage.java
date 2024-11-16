package by.onliner.ui.pages.home;

import by.onliner.ui.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage() {
        driver = Driver.getDriver();
    }

    public String getSiteRulesLinkText(){
        return driver.findElement(By.xpath(HomePageXpath.USER_AGREEMENT_XPATH)).getText();
    }

    public HomePage clickLinkPublicContracts(){
        driver.findElement(By.xpath(HomePageXpath.PUBLIC_CONTRACTS_XPATH)).click();
        return this;
    }
}
