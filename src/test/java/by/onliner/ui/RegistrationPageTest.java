package by.onliner.ui;

import by.onliner.ui.pages.registration.RegistrationPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RegistrationPageTest extends BaseTestRegistrationPage {

    @Test
    @DisplayName("Пустые поля при открытии формы регистрации")
    public void testEmptyFields() {
        RegistrationPage registrationPage = new RegistrationPage();
        String emptyString = "";
        Assertions.assertEquals(emptyString, registrationPage.getEmailInputValue());
        Assertions.assertEquals(emptyString, registrationPage.getPasswordInputValue());
        Assertions.assertEquals(emptyString, registrationPage.getRepeatPasswordInputValue());
    }
}
