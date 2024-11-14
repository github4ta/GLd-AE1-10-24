package by.fiveelement.ui;

import jdk.jfr.Description;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class UserLoginUiTest {
    private WebDriver webDriver;

    private By loginButtonLocator = By.xpath("//a[@class='h-drop h-user']/div/div[@class='h-drop__text'][contains(text(),'Вход')]");
    private By secondLoginButtonLocator = By.xpath("//li[@class='protection-tab active']");
    private By loginFieldLocator = By.xpath("//input[@name='login']");
    private By passwordFieldLocator = By.xpath("//input[@type='password']");
    private By enterButtonLocator = By.xpath("//div[@class='modal-popup-form login-form']/*/*/button");
    private By errorMessageLocator = By.xpath("//span[@class='inp-required validation-text']");

    @BeforeEach
    public void setUp() {
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        webDriver.manage().window().maximize();
        webDriver.get("https://5element.by/");
        webDriver.findElement(loginButtonLocator).click();
        webDriver.findElement(secondLoginButtonLocator).click();
    }

    @Test
    @Description("Unregistered email")
    public void unregisteredEmailTest() {
        String emailOrPhone = "test@test.com";
        String password = "123456";
        String expectedMessage = "Пользователь не найден";
        webDriver.findElement(loginFieldLocator).sendKeys(emailOrPhone);
        webDriver.findElement(passwordFieldLocator).sendKeys(password);
        webDriver.findElement(enterButtonLocator).click();
        Assertions.assertEquals(expectedMessage, webDriver.findElement(errorMessageLocator).getText());
    }

    @Test
    @Description("Wrong password")
    public void wrongPasswordTest() {
        String emailOrPhone = "+375290000000";
        String password = "123456";
        String expectedMessage = "Неверный пароль";
        webDriver.findElement(loginFieldLocator).sendKeys(emailOrPhone);
        webDriver.findElement(passwordFieldLocator).sendKeys(password);
        webDriver.findElement(enterButtonLocator).click();
        Assertions.assertEquals(expectedMessage, webDriver.findElement(errorMessageLocator).getText());
    }

    @Test
    @Description("Incorrect input")
    public void incorrectInputTest() {
        String emailOrPhone = "123123123";
        String password = "123456";
        String expectedMessage = "Некорректный ввод";
        webDriver.findElement(loginFieldLocator).sendKeys(emailOrPhone);
        webDriver.findElement(passwordFieldLocator).sendKeys(password);
        webDriver.findElement(enterButtonLocator).click();
        Assertions.assertEquals(expectedMessage, webDriver.findElement(errorMessageLocator).getText());
    }

    @AfterEach
    public void tearDown() {
        webDriver.quit();
    }
}
