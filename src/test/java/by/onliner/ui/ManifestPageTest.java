package by.onliner.ui;

import by.onliner.ui.pages.home.HomePage;
import by.onliner.ui.pages.home.HomePageMessages;
import by.onliner.ui.pages.home.ManifestPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ManifestPageTest extends BaseTest{

    @Test
    @DisplayName("тест: манифест")
    public void testManifest() {

        String titleManifest =
                new HomePage()
                        .clickManifestLink()
                        .getTitleManifest();
        String linkManifest =new ManifestPage()
                .switchToWindow();
        Assertions.assertEquals(HomePageMessages.MANIFEST_TITLE, titleManifest);
        Assertions.assertEquals(HomePageMessages.MANIFEST_LINK, linkManifest);
    }
}
