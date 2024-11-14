package by.fiveelement.ui;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RobotPylesosRitmixUiTest {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://5element.by/");
        this.driver = driver;
    }

    @Test
    @DisplayName("Все карточки товаров на странице содержат фразу: робот-пылесос Ritmix")
    public void testSearchRobotPylesosRitmix() throws InterruptedException {
        String dropButtonLocationXpath = "//*[@class=\"h-drop h-geo\"]";
        String inputLocationXpath = "//*[@class=\"modal-popup modal-city\"]//*[@class=\"modal-popup__head\"]//input[@type=\"text\"]";
        String searchResultOfLocationXpath = "//*[@class=\"modal-popup__body\"]//*[@class=\"option select-open__highlight checked\"]";
        String inputSearchRequestXpath = "//*[@class=\"inp inp--lg digi-instant-search jc-ignore\"]";
        String productCardLabelXpath = "//*[@class=\"digi-product\"]//*[@class=\"digi-product__label\"]";

        By dropButtonLocationBy = By.xpath(dropButtonLocationXpath);
        WebElement dropButtonLocationWebElement = driver.findElement(dropButtonLocationBy);
        dropButtonLocationWebElement.click();

        By inputLocationBy = By.xpath(inputLocationXpath);
        WebElement inputLocationWebElement = driver.findElement(inputLocationBy);
        inputLocationWebElement.sendKeys("Минск");

        By searchResultOfLocationBy = By.xpath((searchResultOfLocationXpath));
        WebElement searchResultOfLocationWebElement = driver.findElement(searchResultOfLocationBy);
        searchResultOfLocationWebElement.click();

        By inputSearchRequestBy = By.xpath(inputSearchRequestXpath);
        WebElement inputSearchRequestWebElement = driver.findElement(inputSearchRequestBy);
        inputSearchRequestWebElement.sendKeys("робот-пылесос Ritmix");
        inputSearchRequestWebElement.sendKeys(Keys.RETURN);

        Thread.sleep(3000);

        List<WebElement> productCardLabels = driver.findElements(By.xpath(productCardLabelXpath));

        for (WebElement productCardLabel : productCardLabels) {
            Assertions.assertTrue(productCardLabel.getText().toLowerCase().contains("робот-пылесос ritmix"));
        }
    }

    @AfterEach
    public void tearDown() {
        this.driver.quit();
    }
}
