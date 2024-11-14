package by.fiveelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegistrationPage {

    private WebDriver webDriver;
    private WebDriverWait webDriverWait;

    public RegistrationPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
    }

    public void clickEnterOnStartPage() {
        By clickButtonBy = By.xpath(RegistrationXpath.ENTER_BUTTON_XPATH);
        WebElement clickButtonWebElement = webDriver.findElement(clickButtonBy);
        clickButtonWebElement.click();
    }

    public void clickEnterRegistration() {
        By clickRegistrationButtonBy = By.xpath(RegistrationXpath.ENTER_REGISTRATION_BUTTON_XPATH);
        WebElement enterRegistrationButtonWebElement = webDriver.findElement(clickRegistrationButtonBy);
        enterRegistrationButtonWebElement.click();
    }

    public void clickAcceptCockie() {
        By clickAcceptCockieBy = By.xpath(RegistrationXpath.ACCEPT_COCKIE);
        WebElement clickAcceptCockieWebElement = webDriver.findElement(clickAcceptCockieBy);
        clickAcceptCockieWebElement.click();
    }

    public void clickGetCodeButton() {
        By clickGetCodeButtonnBy = By.xpath(RegistrationXpath.GET_CODE_IN_VIBER_OR_SMS_XPATH);
        WebElement clickGetCodeButtonnWebElement = webDriver.findElement(clickGetCodeButtonnBy);
        clickGetCodeButtonnWebElement.click();
    }

    public void inputName(String name) {
        By inputNameBy = By.xpath(RegistrationXpath.INPUT_NAME_XPATH);
        WebElement inputNameWebElement = webDriver.findElement(inputNameBy);
        inputNameWebElement.sendKeys(name);
    }

    public void inputPhone(String phone) {
        By inputPhoneBy = By.xpath(RegistrationXpath.INPUT_PHONE_XPATH);
        WebElement inputPhoneWebElement = webDriver.findElement(inputPhoneBy);
        inputPhoneWebElement.sendKeys(phone);
    }

    public String checkSendCode() {
        WebElement checkCodeWebElement = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(RegistrationXpath.CHECK_SEND_CODE_XPATH)));
        return checkCodeWebElement.getText();
    }

    public String checkSendCodeOnNumber() {
        WebElement checkSendCodeOnNumberWebElement = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(RegistrationXpath.CHECK_SEND_ON_NUMBER)));
        return checkSendCodeOnNumberWebElement.getText();
    }
}