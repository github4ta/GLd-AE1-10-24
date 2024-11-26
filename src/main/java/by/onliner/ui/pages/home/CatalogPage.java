package by.onliner.ui.pages.home;

import by.onliner.ui.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CatalogPage extends HomePage {

    private WebDriver driver;

    public CatalogPage() {
        driver = Driver.getDriver();
    }

    public CatalogPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTextCatalog() {
        return driver.findElement(By.xpath(CatalogXpath.TEXT_CATALOG_XPATH)).getText();
    }
}
