package by.fiveelement;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

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

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://5element.by/");
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
