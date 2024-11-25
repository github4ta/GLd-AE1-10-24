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

    public void clickButtonNext() {
        driver.findElement(By.xpath(RecoverPasswordPageXpath.AUTH_FORM_SUBMIT_BUTTON_XPATH)).click();
    }
}
