package biz.svyatoslav.ui;

import biz.svyatoslav.ui.driver.Driver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    @BeforeEach
    public void  setUp() {
        WebDriver driver = Driver.getDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
    }

    @AfterEach
    public void tearDown() {
        Driver.quit();
    }
}
