package by.fiveelement;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;


public class SocialLinksUiTest {
    private WebDriver driver;

    @BeforeEach
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1920,1080));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.get("https://5element.by/");

    }

    @Test
    @DisplayName("тест: YouTube")
    public void test1() {
        By youTubeBy = By.xpath("//*[@id=\"app\"]/footer/div[1]/div/div/div[2]/div[2]/a[1]");
        WebElement elementYouTube = driver.findElement(youTubeBy);
        elementYouTube.click();
        Assertions.assertEquals("https://www.youtube.com/user/5elementBelarus", elementYouTube.getAttribute("href"));
    }

    @Test
    @DisplayName("тест: Instagram")
    public void test2() {
        By instagramBy = By.xpath("//*[@id=\"app\"]/footer/div[1]/div/div/div[2]/div[2]/a[2]");
        WebElement elementInstagram = driver.findElement(instagramBy);
        elementInstagram.click();
        Assertions.assertEquals("https://www.instagram.com/5elementbelarus/", elementInstagram.getAttribute("href"));
    }

    @Test
    @DisplayName("тест: Facebook")
    public void test3() {
        By facebookBy = By.xpath("//*[@id=\"app\"]/footer/div[1]/div/div/div[2]/div[2]/a[3]");
        WebElement elementFacebook = driver.findElement(facebookBy);
        elementFacebook.click();
        Assertions.assertEquals("https://www.facebook.com/5ElementBelarus", elementFacebook.getAttribute("href"));
    }

    @Test
    @DisplayName("тест: VK")
    public void test4() {
        By vKBy = By.xpath("//*[@id=\"app\"]/footer/div[1]/div/div/div[2]/div[2]/a[4]");
        WebElement elementVk = driver.findElement(vKBy);
        elementVk.click();
        Assertions.assertEquals("https://vk.com/5elementbelarus", elementVk.getAttribute("href"));
    }

    @Test
    @DisplayName("тест: Telegram")
    public void test5() {
        By telegramBy = By.xpath("//*[@id=\"app\"]/footer/div[1]/div/div/div[2]/div[2]/a[5]");
        WebElement elementTelegram = driver.findElement(telegramBy);
        elementTelegram.click();
        Assertions.assertEquals("https://t.me/fivelementbelarus", elementTelegram.getAttribute("href"));
    }

    @Test
    @DisplayName("тест: OK")
    public void test6() {
        By oKBy = By.xpath("//*[@id=\"app\"]/footer/div[1]/div/div/div[2]/div[2]/a[6]");
        WebElement elementOk = driver.findElement(oKBy);
        elementOk.click();
        Assertions.assertEquals("https://ok.ru/elementbelarus", elementOk.getAttribute("href"));
    }

    @Test
    @DisplayName("тест: Tiktok")
    public void test7() {
        By tiktokBy = By.xpath("//*[@id=\"app\"]/footer/div[1]/div/div/div[2]/div[2]/a[7]");
        WebElement elementTiktok = driver.findElement(tiktokBy);
        elementTiktok.click();
        Assertions.assertEquals("https://www.tiktok.com/@5elementbelarus", elementTiktok.getAttribute("href"));
    }

    @AfterEach
    public void tearDown(){
        driver.quit();
    }

}
