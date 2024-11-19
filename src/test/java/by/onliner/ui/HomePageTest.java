package by.onliner.ui;

import by.onliner.ui.pages.home.HomePage;
import by.onliner.ui.pages.home.HomePageXpath;
import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class HomePageTest extends BaseTest {

    @Test
    @DisplayName("Текст Политика обработки персональных данных отоборажается в футере")
    public void testDisplayTextPersonalDataProcessingPolicy(){
        HomePage homePage = new HomePage();
        String expectedText = "Политика обработки персональных данных";
        String actualText= homePage.getTextPersonalDataProcessingPolicy();
        Assertions.assertTrue(actualText.equals(expectedText), "Неверный текст ссылки");
    }
}
