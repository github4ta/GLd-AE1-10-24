package by.onliner.ui;

import by.onliner.ui.pages.home.AdvertisingPageExpectations;
import by.onliner.ui.pages.home.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AdvertisingPageTest extends BaseTest{

    @Test
    void moveFromHomeToAdvertisingTest(){
        String title =
                new HomePage()
                        .clickLinkAdvertising()
                        .getTitle();

        Assertions.assertEquals(AdvertisingPageExpectations.TITLE, title);
    }
}
