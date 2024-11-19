package by.onliner.ui;

import by.onliner.ui.pages.home.HomePage;
import by.onliner.ui.pages.home.HomePageXpath;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageTest extends BaseTest {
    private WebDriver driver;
    private HomePage homepage;

    @BeforeEach
    public void setup() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.onliner.by/");
        driver.manage().window().fullscreen();
        this.driver = driver;

        this.homepage = new HomePage(this.driver);


        @Test
        @DisplayName("Правила возврата в футере на домашней странице")
        public void returnPolicy() {
            this.homepage.clickReturnPolicyLink();
            Assertions.assertEquals(HomePageXpath.FOOTER_LINK_RETURN_POLICY_XPATH, HomePage.getTextReturnPolicy);
        }
    }
    }
