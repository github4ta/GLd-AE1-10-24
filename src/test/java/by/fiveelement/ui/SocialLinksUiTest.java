package by.fiveelement.ui;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.Set;


public class SocialLinksUiTest {
    private WebDriver driver;

    @BeforeEach
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1920,1080));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.get("https://5element.by/");
    }

    public static void switchToWindow(WebDriver driver){
        String originalWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        for (String windowHandle : allWindows) {
            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
    }

    @Test
    @DisplayName("тест: YouTube")
    public void linkYouTube() {
        By youTubeBy = By.xpath("//*[@id=\"app\"]/footer/div[1]/div/div/div[2]/div[2]/a[1]");
        WebElement elementYouTube = driver.findElement(youTubeBy);
        elementYouTube.click();
        switchToWindow(driver);
        Assertions.assertEquals("https://www.youtube.com/user/5elementBelarus", driver.getCurrentUrl());
    }

    @Test
    @DisplayName("тест: Instagram")
    public void linkInstagram() {
        By instagramBy = By.xpath("//*[@id=\"app\"]/footer/div[1]/div/div/div[2]/div[2]/a[2]");
        WebElement elementInstagram = driver.findElement(instagramBy);
        elementInstagram.click();
        switchToWindow(driver);
        Assertions.assertEquals("https://www.instagram.com/5elementbelarus/", driver.getCurrentUrl());
    }

    @Test
    @DisplayName("тест: Facebook")
    public void linkFacebook() {
        By facebookBy = By.xpath("//*[@id=\"app\"]/footer/div[1]/div/div/div[2]/div[2]/a[3]");
        WebElement elementFacebook = driver.findElement(facebookBy);
        elementFacebook.click();
        switchToWindow(driver);
        Assertions.assertEquals("https://www.facebook.com/5ElementBelarus", driver.getCurrentUrl());
    }

    @Test
    @DisplayName("тест: VK")
    public void linkVk() {
        By vKBy = By.xpath("//*[@id=\"app\"]/footer/div[1]/div/div/div[2]/div[2]/a[4]");
        WebElement elementVk = driver.findElement(vKBy);
        elementVk.click();
        switchToWindow(driver);
        Assertions.assertEquals("https://vk.com/5elementbelarus", driver.getCurrentUrl());
    }

    @Test
    @DisplayName("тест: Telegram")
    public void linkTelegram() {
        By telegramBy = By.xpath("//*[@id=\"app\"]/footer/div[1]/div/div/div[2]/div[2]/a[5]");
        WebElement elementTelegram = driver.findElement(telegramBy);
        elementTelegram.click();
        switchToWindow(driver);
        Assertions.assertEquals("https://t.me/fivelementbelarus", driver.getCurrentUrl());
    }

    @Test
    @DisplayName("тест: OK")
    public void linkOk() {
        By oKBy = By.xpath("//*[@id=\"app\"]/footer/div[1]/div/div/div[2]/div[2]/a[6]");
        WebElement elementOk = driver.findElement(oKBy);
        elementOk.click();
        switchToWindow(driver);
        Assertions.assertEquals("https://ok.ru/elementbelarus", driver.getCurrentUrl());
    }

    @Test
    @DisplayName("тест: Tiktok")
    public void linkTiktok() {
        By tiktokBy = By.xpath("//*[@id=\"app\"]/footer/div[1]/div/div/div[2]/div[2]/a[7]");
        WebElement elementTiktok = driver.findElement(tiktokBy);
        elementTiktok.click();
        switchToWindow(driver);
        Assertions.assertEquals("https://www.tiktok.com/@5elementbelarus", driver.getCurrentUrl());
    }

    @AfterEach
    public void tearDown(){
        driver.quit();
    }
}
