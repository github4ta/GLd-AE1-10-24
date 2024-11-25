package by.onliner.ui;

import by.onliner.ui.pages.home.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import java.sql.SQLOutput;
import java.util.Set;

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
    public void testDisplayTextPersonalDataProcessingPolicy() {
        HomePage homePage = new HomePage();
        String expectedText = "Политика обработки персональных данных";
        String actualText = homePage.getTextPersonalDataProcessingPolicy();
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

    @Test
    @DisplayName("Текст ссылки 'Правила возврата' отображается в футере")
    public void testDisplayReturnPolicyLinkInFooter() {
        HomePage homePage = new HomePage();
        String expectedResultReturnPolicy = "Правила возврата";
        Assertions.assertEquals(expectedResultReturnPolicy, homePage.getTextReturnPolicy());
    }

    @Test
    @DisplayName("Отображение ссылки 'Вакансии' в футере страницы")
    public void testDisplayVacanciesLinkInFooter() {
        HomePage homePage = new HomePage();

        String expectedResult = "Вакансии";
        String actualResult = homePage.getVacanciesLinkText();

        Assertions.assertEquals(expectedResult, actualResult, "Неверный текст ссылки");
    }

    @Test
    @DisplayName("Текст ссылки 'Тарифы' отображается в футере")
    public void testDisplayTariffsLink() {
        HomePage homePage = new HomePage();
        String expectedResultTariffs = "Тарифы";
        Assertions.assertEquals(expectedResultTariffs, homePage.getTariffsFooterLinkText(), "Неверный текст ссылки");
    }

    @Test
    @DisplayName("Текст ссылки 'Публичные договоры' отображается в футере")
    public void testDisplayPublicContractsLink() {
        HomePage homePage = new HomePage();

        String expectedResult = "Публичные договоры";
        Assertions.assertEquals(expectedResult, homePage.getTextPublicContracts());
    }

    @Test
    @DisplayName("Проверка на корректный переход по ссылке VK")
    public void testVkLink() {
        HomePage homePage = new HomePage();
        String expectedLink = "https://vk.com/onliner";
        Assertions.assertEquals(expectedLink, homePage.clickVkLink().getActualLink());
    }

    @Test
    @DisplayName("Проверка на корректный переход по ссылке FaceBook")
    public void testFaceBookLink() {
        HomePage homePage = new HomePage();
        String expectedLink = "https://www.facebook.com/onlinerby";
        Assertions.assertEquals(expectedLink, homePage.clickFaceBookLink().getActualLink());
    }

    @Test
    @DisplayName("Проверка на корректный переход по ссылке X")
    public void testXLink() {
        HomePage homePage = new HomePage();
        String expectedLink = "https://x.com/OnlinerBY";
        Assertions.assertEquals(expectedLink, homePage.clickTwitterLink().getActualLink());
    }

    @Test
    @DisplayName("Проверка на корректный переход по ссылке YouTube")
    public void testYouTubeLink() {
        HomePage homePage = new HomePage();
        String expectedLink = "https://www.youtube.com/onlinerby";
        Assertions.assertEquals(expectedLink, homePage.clickYouTubeLink().getActualLink());
    }
}
