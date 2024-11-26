package by.onliner.ui.pages.recover;

import by.onliner.ui.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RecoverPasswordPage {

    private WebDriver driver;

    public RecoverPasswordPage() {
        WebDriver driver = Driver.getDriver();
        this.driver = driver;
    }

    public RecoverPasswordPage sendKeysUserNameRecoverPassword(String login) {
        driver.findElement(By.xpath(RecoverPasswordPageXpath.AUTH_FORM_DATA_INPUT_XPATH)).sendKeys(login);
        return this;
    }

    public void clickButtonNext() {
        driver.findElement(By.xpath(RecoverPasswordPageXpath.AUTH_FORM_SUBMIT_BUTTON_XPATH)).click();
    }
}
