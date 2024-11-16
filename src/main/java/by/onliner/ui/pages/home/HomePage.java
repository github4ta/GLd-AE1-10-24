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
}
