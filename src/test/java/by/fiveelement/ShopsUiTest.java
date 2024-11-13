package by.fiveelement;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ShopsUiTest {
    protected WebDriver driver;

    public static final String DROPDOWN_CITIES_XPATH = "//span[@class='ic-h-location']";
    public static final String DROPDOWN_OPTION_CITIES_MINSK_XPATH = "//div[@class='option select-open__highlight checked']";
    public static final String FOOTER_ADDRESSES_XPATH = "//*[@id=\"app\"]/footer/div[2]/div/div/div[1]/div[1]/ul/li[2]/a";
    public static final String BUTTON_LIST_ADDRESSES_XPATH = "//button[@class='nav-link active']";

    public ShopsUiTest clickDropdownCities() {
        driver.findElement(By.xpath(DROPDOWN_CITIES_XPATH)).click();
        return this;
    }

    public ShopsUiTest clickDropdownCitiesMinskOption() {
        driver.findElement(By.xpath(DROPDOWN_OPTION_CITIES_MINSK_XPATH)).click();
        return this;
    }

    public ShopsUiTest clickFooterAddresses() {
        driver.findElement(By.xpath(FOOTER_ADDRESSES_XPATH)).click();
        return this;
    }

    public ShopsUiTest clickButtonListAddresses() {
        driver.findElement(By.xpath(BUTTON_LIST_ADDRESSES_XPATH)).click();
        return this;
    }

    public static final String[] requiredAddressesList = {
            "ул. Корженевского, 26 (ТЦ «Корона», 1 этаж)",
            "пр-т Победителей, 65/1 (ТЦ «Замок», 4 этаж)",
            "пр-т Независимости, 154 (ТЦ «Корона», 1 этаж)",
            "ул. Кальварийская, 24 (ТЦ «Корона», 2 этаж)",
            "ул. Денисовская, 8 (ТЦ «Корона-Сити», 1 этаж)",
            "ул. Монтажников, 2 (Гипермаркет «Евроопт», 1 этаж)",
            "пр-т Партизанский, 79 (ТЦ «Prizma», цокольный этаж)",
            "пр-т Дзержинского, 104-2 (ТЦ «Титан», 1 этаж)",
            "ул. Голубка, 2 (ТЦ «Бонус», 2 этаж)",
            "ул. Горецкого, 2 (ТЦ «Гиппо», 1 этаж)",
            "д. Боровая, 7а (ТЦ «Боро», 1 этаж)",
            "ул. Мстиславца, 11 (ТЦ «Dana Mall», 3 этаж)",
            "пр-т Победителей, 9 (ТРЦ «Галерея Минск», 4 этаж)",
            "пр. Независимости, 117",
            "ул. Нестерова, 49 (Гипермаркет «Евроопт», 2 этаж)",
            "ул. Притыцкого, 156 (ТЦ «GreenCity», 2 этаж)",
            "ул. Кульман, 14-1 (1 этаж)"
    };

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://5element.by/");
    }

    @Test
    public void checkShopListTest() {
        clickDropdownCities()
                .clickDropdownCitiesMinskOption()
                .clickFooterAddresses()
                .clickButtonListAddresses();

        List<WebElement> addressElements = driver.findElements(By.xpath("//b[@class='si-name']"));

        Set<String> actualAddresses = new HashSet<>();
        for (WebElement addressElement : addressElements) {
            actualAddresses.add(addressElement.getText());
        }

        Set<String> expectedAddresses = new HashSet<>();
        for (String expectedAddress : requiredAddressesList) {
            expectedAddresses.add(expectedAddress);
        }

        Assertions.assertEquals(expectedAddresses, actualAddresses);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
