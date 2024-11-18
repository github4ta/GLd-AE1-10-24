package by.fiveelement.ui;

import by.fiveelement.ui.page.cart.CartPage;
import by.fiveelement.ui.page.cart.CartPageMessage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ExcludeProductFromCartUiTest {

    WebDriver webDriver = new ChromeDriver();
    @BeforeEach
    public void setUp() {
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        webDriver.get("https://5element.by/");
        webDriver.manage().window().maximize();
    }

    @Test
    public void excludeProductFromCart() {
        CartPage cartPage = new CartPage(webDriver);

        cartPage.clickButtonCatalog()
                .clickButtonSmartphonesAndGadgets()
                .clickButtonSmartphones()
                .clickButtonAddToCart().
        clickButtonGoToCart().clickButtonCancelToCart();
        Assertions.assertTrue(cartPage.getTextAfterCancelItem().contains(CartPageMessage.TEXT_CANCALE_FROM_CART));
    }

}
