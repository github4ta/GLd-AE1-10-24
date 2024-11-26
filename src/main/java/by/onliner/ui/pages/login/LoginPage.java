package by.onliner.ui.pages.login;

import by.onliner.ui.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    public LoginPage() {
        WebDriver driver = Driver.getDriver();
        this.driver = driver;
    }

    public void openLoginForm() {
        By buttonOpenLoginFormBy = By.xpath(LoginPageXpath.BUTTON_OPEN_LOGIN_FORM_XPATH);
        WebElement buttonOpenLoginFormWebElement = this.driver.findElement(buttonOpenLoginFormBy);
        buttonOpenLoginFormWebElement.click();
    }

    public void sendKeysUsername(String login) {
        By inputUsernameBy = By.xpath(LoginPageXpath.INPUT_NAME_XPATH);
        WebElement inputUsernameWebElement = this.driver.findElement(inputUsernameBy);
        inputUsernameWebElement.sendKeys(login);
    }

    public void sendKeysPassword(String password) {
        By inputPasswordBy = By.xpath(LoginPageXpath.INPUT_PASSWORD_XPATH);
        WebElement inputPasswordWebElement = this.driver.findElement(inputPasswordBy);
        inputPasswordWebElement.sendKeys(password);
    }

    public void clickButtonLogin() {
        By buttonLoginBy = By.xpath(LoginPageXpath.BUTTON_LOGIN_XPATH);
        WebElement buttonLoginWebElement = this.driver.findElement(buttonLoginBy);
        buttonLoginWebElement.click();
    }

    public String getUsernameErrorMessage() {
        By usernameErrorMessageBy = By.xpath(LoginPageXpath.ERROR_MESSAGE_USERNAME);
        WebElement usernameErrorMessageWebElement = this.driver.findElement(usernameErrorMessageBy);

        return usernameErrorMessageWebElement.getText();
    }
    public String getPasswordErrorMessage() {
        By passwordErrorMessageBy = By.xpath(LoginPageXpath.ERROR_MESSAGE_PASSWORD);
        WebElement passwordErrorMessageWebElement = this.driver.findElement(passwordErrorMessageBy);

        return passwordErrorMessageWebElement.getText();
    }

}
