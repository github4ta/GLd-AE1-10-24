package by.onliner.ui;

import by.onliner.ui.driver.Driver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    @BeforeEach
    public void startFromHome() {
        Driver.getDriver().get("https://www.onliner.by/");
    }

    @AfterEach
    public void tearDown() {
        Driver.quit();
    }
}
