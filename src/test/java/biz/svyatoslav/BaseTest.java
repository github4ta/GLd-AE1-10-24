package biz.svyatoslav;

import biz.svyatoslav.driver.Driver;
import org.junit.jupiter.api.AfterEach;

public class BaseTest {

    @AfterEach
    public void tearDown() {
        Driver.quit();
    }
}
