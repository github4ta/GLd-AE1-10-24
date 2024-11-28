package by.onliner.ui.pages.home;

import by.onliner.ui.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HousesAndFlatsPage {
    private WebDriver driver;
    private static final By TAB_LOCATOR = By.className("project-navigation__text");

    public HousesAndFlatsPage() {
        driver = Driver.getDriver();
    }

    public List<String> getTabNames() {
        List<WebElement> tabs = driver.findElements(TAB_LOCATOR);

        return tabs.stream()
                .map(WebElement::getText)
                .toList();
    }
}
