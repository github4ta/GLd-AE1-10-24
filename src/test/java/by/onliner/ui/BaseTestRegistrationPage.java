package by.onliner.ui;

import by.onliner.ui.driver.Driver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTestRegistrationPage {

    @BeforeEach
    public void startFromHome() {
        Driver.getDriver().get("https://profile.onliner.by/registration");
    }

    @AfterEach
    public void tearDown() {
        Driver.quit();
    }
}
