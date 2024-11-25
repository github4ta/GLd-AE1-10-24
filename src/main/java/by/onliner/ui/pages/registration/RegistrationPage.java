package by.onliner.ui.pages.registration;

import by.onliner.ui.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

    private WebDriver driver;

    public RegistrationPage() {
        driver = Driver.getDriver();
    }

    public String getEmailInputValue() {
        return driver.findElement(By.xpath(RegistrationPageXpath.INPUT_EMAIL_XPATH)).getAttribute("value");
    }

    public String getPasswordInputValue() {
        return driver.findElement(By.xpath(RegistrationPageXpath.INPUT_PASSWORD_XPATH)).getAttribute("value");
    }

    public String getRepeatPasswordInputValue() {
        return driver.findElement(By.xpath(RegistrationPageXpath.INPUT_REPEAT_PASSWORD_XPATH)).getAttribute("value");
    }

    public void clickAcceptProcessingPersonalDataCheckbox() {
        driver.findElement(By.xpath(RegistrationPageXpath.ACCEPT_PROCESSING_PERSONAL_DATA_CHECKBOX_XPATH)).click();
    }
}
