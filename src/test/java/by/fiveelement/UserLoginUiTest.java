package by.fiveelement;

import jdk.jfr.Description;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserLoginUiTest {
    private WebDriver webDriver;
    private By loginButtonLocator = By.xpath("//a[@class='h-drop h-user']/div/div[@class='h-drop__text'][contains(text(),'Вход')]");
    private By secondLoginButtonLocator = By.xpath("//li[@class='protection-tab active']");
    private By loginFieldLocator = By.xpath("//input[@name='login']");
    private By passwordFieldLocator = By.xpath("//input[@type='password']");
    private By enterButtonLocator = By.xpath("//div[@class='modal-popup-form login-form']/*/*/button");

    @BeforeEach
    public void setUp(){
        webDriver = new ChromeDriver();
        webDriver.get("https://5element.by/");
        webDriver.findElement(loginButtonLocator).click();
        webDriver.findElement(secondLoginButtonLocator).click();
    }
}
