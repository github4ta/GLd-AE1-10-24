package by.fiveelement.ui;

import by.fiveelement.ui.page.cart.CartPage;
import by.fiveelement.ui.page.cart.CartPageMessage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AddProductToCartUiTest {
    WebDriver webDriver = new ChromeDriver();
    @BeforeEach
    public void setUp() {
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        webDriver.get("https://5element.by/");
        webDriver.manage().window().maximize();
    }

    @Test
    public void addProductToCartTest() {
        CartPage cartPage = new CartPage(webDriver);

        cartPage.clickButtonCatalog()
                .clickButtonSmartphonesAndGadgets()
                .clickButtonSmartphones()
                .clickButtonAddToCart();

        Assertions.assertTrue(cartPage.getTextAboutSmartphone().contains(CartPageMessage.TEXT_ADD_TO_CART));
    }

    @AfterEach
    public void tearDown() {
        webDriver.quit();
    }
}
