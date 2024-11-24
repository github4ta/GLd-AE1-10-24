package by.onliner.ui;

import by.onliner.ui.pages.login.LoginPage;
import by.onliner.ui.pages.login.LoginPageMessages;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage;

    @BeforeEach
    public void setUp() {
        LoginPage loginPage = new LoginPage();
        loginPage.openLoginForm();

        this.loginPage = loginPage;
    }

    @Test
    @DisplayName("Проверка формы логина с пустыми полями")
    public void blankUsernameAndBlankPassword() {
        this.loginPage.sendKeysUsername("");
        this.loginPage.sendKeysPassword("");
        this.loginPage.clickButtonLogin();

        Assertions.assertEquals(LoginPageMessages.USERNAME_IS_REQUIRED, loginPage.getUsernameErrorMessage());
        Assertions.assertEquals(LoginPageMessages.PASSWORD_IS_REQUIRED, loginPage.getPasswordErrorMessage());
    }
}
