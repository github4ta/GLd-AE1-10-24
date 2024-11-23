package by.onliner.ui;

import by.onliner.ui.pages.home.HomePage;
import by.onliner.ui.pages.home.HomePageXpath;
import by.onliner.ui.pages.home.ManifestPage;
import org.junit.jupiter.api.*;


public class ManifestPageTest extends BaseTest {

    @Test
    @DisplayName("тест: манифест")
    public void testManifest() {

        String titleManifest =
                new HomePage()
                        .clickManifestLink()
                        .getTitleManifest();
        String linkManifest =new ManifestPage()
                        .switchToWindow();
        Assertions.assertEquals(HomePageXpath.MANIFEST_TITLE, titleManifest);
        Assertions.assertEquals(HomePageXpath.MANIFEST_LINK, linkManifest);
    }
}

