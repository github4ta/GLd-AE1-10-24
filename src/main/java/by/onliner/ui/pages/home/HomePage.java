package by.onliner.ui.pages.home;

import by.onliner.ui.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage() {
        driver = Driver.getDriver();
    }

    public String getVacanciesLinkText(){
        return driver.findElement(By.xpath(HomePageXpath.VACANCIES_XPATH)).getText();
    }

    public void clickManifestLink(){
        driver.findElement(By.xpath(HomePageXpath.MANIFEST_XPATH)).click();
    }
}
