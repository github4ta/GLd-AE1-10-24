package by.fiveelement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddProductToCartUiTest extends BaseTest {
    @Test
    public void addProductToCartTest() {
        CartPage cartPage = new CartPage(webDriver);

        cartPage.clickButtonCatalog()
                .clickButtonSmartphonesAndGadgets()
                .clickButtonSmartphones()
                .clickButtonAddToCart();

        Assertions.assertTrue(cartPage.getTextAboutSmartphone().contains(CartPageMessage.TEXT_ADD_TO_CART));
    }
}
