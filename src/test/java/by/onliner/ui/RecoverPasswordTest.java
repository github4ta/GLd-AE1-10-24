package by.onliner.ui;

import by.onliner.ui.pages.recover.CookiePopup;
import by.onliner.ui.pages.recover.RecoverPasswordMessage;
import by.onliner.ui.pages.recover.RecoverPasswordPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RecoverPasswordTest extends BaseTest {

    @BeforeEach
    void setUpRecoverPassword() {
        CookiePopup cookiePopup = new CookiePopup();
        cookiePopup.acceptCookie();
    }

    @Test
    @DisplayName("Пустой логин при восстановлении пароля")
    public void testRecoverPasswordEmptyLogin() {
        RecoverPasswordPage recoverPasswordPage = new RecoverPasswordPage();
        recoverPasswordPage
                .clickSignInButton()
                .clickOpenFormRecoverPassword()
                .clickButtonNext();

        Assertions.assertEquals(recoverPasswordPage.getTextMessageLoginEmpty(), RecoverPasswordMessage.ERROR_MESSAGE_EMPTY_LOGIN);
    }
}
