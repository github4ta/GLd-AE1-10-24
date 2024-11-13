package by.fiveelement;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    public WebDriver webDriver;

    @BeforeEach
    public void setUp() {
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        webDriver.get("https://5element.by/");
        webDriver.manage().window().maximize();
    }

    @AfterEach
    public void tearDown() {
        webDriver.quit();
    }
}
