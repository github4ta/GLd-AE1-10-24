package by.fiveelement;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopsUiTest {
    private static WebDriver driver;
    WebElement dropdownCities = driver.findElement(By.xpath("//*[@id=\"app\"]/header/div[1]/div[1]/div/div/div[1]/div/div[1]"));
    WebElement dropdownCitiesMinskOption = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div/div[2]/div/div[1]/div[1]"));
    WebElement buttonExitCityPopup = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/button"));
    WebElement footerAddresses = driver.findElement(By.xpath("//*[@id=\"app\"]/footer/div[2]/div/div/div[1]/div[1]/ul/li[2]/a"));
    WebElement buttonListAddresses = driver.findElement(By.xpath("//button[@class='nav-link active']"));

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://5element.by/");
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
