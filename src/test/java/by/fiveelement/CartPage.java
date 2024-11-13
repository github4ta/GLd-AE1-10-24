package by.fiveelement;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {
    public WebDriver webDriver;
    public WebDriverWait webDriverWait;

    public CartPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
    }

    public CartPage clickButtonCatalog() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(CartPageXPath.BUTTON_CATALOG_XPATH))).click();
        return this;
    }

    public CartPage clickButtonSmartphonesAndGadgets() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(CartPageXPath.BUTTON_SMARTPHONES_AND_GADGETS_XPATH))).click();
        return this;
    }

    public CartPage clickButtonSmartphones() {
        WebElement smartphonesMenu = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(CartPageXPath.MENU_SMARTPHONES_AND_GADGETS_XPATH)));
        Actions actions = new Actions(webDriver);
        actions.moveToElement(smartphonesMenu).perform();
        WebElement smartphonesButton = webDriver.findElement(By.xpath(CartPageXPath.BUTTON_SMARTPHONES_XPATH));
        smartphonesButton.click();
        return this;
    }

    public CartPage clickButtonAddToCart() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(CartPageXPath.BUTTON_ADD_TO_CART_XPATH))).click();
        return this;
    }

    public String getTextAboutSmartphone() {
        return webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(CartPageXPath.TEXT_ADD_TO_CART_XPATH))).getText();
    }
}
