package by.onliner.ui;

import by.onliner.ui.pages.home.CatalogMessage;
import by.onliner.ui.pages.home.CatalogPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CatalogPageTest extends BaseTest {

    @Test
    @DisplayName("Cсылка Каталог основного меню открывает страницу Каталог")
    public void testLinkCatalogOpens() {
        CatalogPage catalogPage = new CatalogPage();

        catalogPage.clickLinkCatalog();

        Assertions.assertEquals(CatalogMessage.TITLE_CATALOG, catalogPage.getTextCatalog());
    }
}
