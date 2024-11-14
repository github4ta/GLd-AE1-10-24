package by.fiveelement;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class GofryVozduhovodyUiTest {

    protected WebDriver webDriver;

    String url = "https://5element.by/";
    public static final String BUTTON_LOCATION_XPATH = "//span[@class='ic-h-location']";
    public static final String MINSK_XPATH = "//div[@class='option select-open__highlight checked']";
    public static final String BUTTON_CATALOG_XPATH = "//button//span[text()='Каталог']";
    public static final String BUTTON_TEHNIKA_DLYA_KUHNI_XPATH = "//a[@href='/catalog/21-tehnika-dlya-kuhni']";
    public static final String ITEM_GOFRY_VOZDUHOVODY_XPATH = "//a[@href='/catalog/663-gofry-vozduhovody']";
    public static final String HEADER_GOFRY_VOZDUHOVODY_XPATH = "//h1[text()='Гофры (воздуховоды)']";
    public static final String HEADER_GOFRY_VOZDUHOVODY = "Гофры (воздуховоды)";

    @BeforeEach
    public void setup() {
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        webDriver.manage().window().maximize();
        webDriver.get(url);
        clickButtonLocation().chooseMinsk().clickButtonCatalog().clickButtonTehnikaDlyaKuhni().clickItemGofryVozduhovodi();
    }

    @Test
    @DisplayName("проверка заголовка страницы - Гофры (воздуховоды)")
    public void testHeaderGofryVozduhovody() {
        String actualResult = getTextGofryVozduhovody();
        Assertions.assertEquals(HEADER_GOFRY_VOZDUHOVODY, actualResult);
    }

    @AfterEach
    public void tearDown() {
        webDriver.quit();
    }

    public GofryVozduhovodyUiTest clickButtonLocation() {
        webDriver.findElement(By.xpath(BUTTON_LOCATION_XPATH)).click();
        return this;
    }

    public GofryVozduhovodyUiTest chooseMinsk() {
        webDriver.findElement(By.xpath(MINSK_XPATH)).click();
        return this;
    }

    public GofryVozduhovodyUiTest clickButtonCatalog() {
        webDriver.findElement(By.xpath(BUTTON_CATALOG_XPATH)).click();
        return this;
    }

    public GofryVozduhovodyUiTest clickButtonTehnikaDlyaKuhni() {
        webDriver.findElement(By.xpath(BUTTON_TEHNIKA_DLYA_KUHNI_XPATH)).click();
        return this;
    }

    public void clickItemGofryVozduhovodi() {
        webDriver.findElement(By.xpath(ITEM_GOFRY_VOZDUHOVODY_XPATH)).click();
    }

    public String getTextGofryVozduhovody() {
        return webDriver.findElement(By.xpath(HEADER_GOFRY_VOZDUHOVODY_XPATH)).getText();
    }
}
