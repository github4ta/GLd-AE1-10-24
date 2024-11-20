package by.onliner.ui;

import by.onliner.ui.pages.home.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class HomePageTest extends BaseTest {

    @Test
    @DisplayName("Отображение ссылки 'Контакты редакции' в футере страницы")
    public void testDisplayEditorContactsLink() {
        HomePage homePage = new HomePage();

        String expectedResult = "Контакты редакции";
        String actualResult = homePage.getTextEditorContacts();

        Assertions.assertEquals(expectedResult, actualResult, "Неверный текст ссылки");
    }

    @Test
    @DisplayName("Текст Политика обработки персональных данных отоборажается в футере")
    public void testDisplayTextPersonalDataProcessingPolicy(){
        HomePage homePage = new HomePage();
        String expectedText = "Политика обработки персональных данных";
        String actualText= homePage.getTextPersonalDataProcessingPolicy();
        Assertions.assertEquals(expectedText, actualText, "Неверный текст ссылки");
    }

    @Test
    @DisplayName("Текст ссылки 'Реклама' отображается в футере")
    public void testDisplayAdvertisingLink() {
        HomePage homePage = new HomePage();

        String expectedResult = "Реклама";
        Assertions.assertEquals(expectedResult, homePage.getTextAdvertisingLink());
    }

    @Test
    @DisplayName("Текст ссылки 'Манифест' отображается в футере")
    public void testDisplayManifestLink() {
        HomePage homePage = new HomePage();
        String expectedResult = "Манифест";
        Assertions.assertEquals(expectedResult, homePage.getTextManifest());
    }
}
