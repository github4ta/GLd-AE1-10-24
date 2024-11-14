package by.fiveelement.ui;

import by.fiveelement.ui.page.registration.RegistrationMessage;
import by.fiveelement.ui.page.registration.RegistrationPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class UserRegistrationUiTest {

    WebDriver webDriver = new ChromeDriver();

    @BeforeEach
    public void setUp() {
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        webDriver.get("https://5element.by/");
        webDriver.manage().window().maximize();
    }

    @Test
    @DisplayName("Проверка регистрации и отправки смс")
    public void testAuthorizationAndSendSms() {
        RegistrationPage registrationPage = new RegistrationPage(webDriver);
        registrationPage.clickAcceptCockie()
        .clickEnterOnStartPage()
        .clickEnterRegistration()
        .inputName("JohnBlack")
        .inputPhone("290000000")
        .clickGetCodeButton();
        Assertions.assertEquals(registrationPage.checkSendCode(), RegistrationMessage.INVITE_CODE);
        Assertions.assertTrue(registrationPage.checkSendCodeOnNumber().contains(RegistrationMessage.INVITE_CODE_ON_NUMBER));
    }

    @AfterEach
    public void tearDown() {
        webDriver.quit();
    }
}