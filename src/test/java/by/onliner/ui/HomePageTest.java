package by.onliner.ui;

import by.onliner.ui.pages.home.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HomePageTest extends BaseTest {

    @Test
    @DisplayName("Текст ссылки 'Реклама' отображается в футере")
    public void testDisplayAdvertisingLink() {
        HomePage homePage = new HomePage();

        String expectedResult = "Реклама";
        Assertions.assertEquals(expectedResult, homePage.getTextAdvertisingLink());
    }
}
