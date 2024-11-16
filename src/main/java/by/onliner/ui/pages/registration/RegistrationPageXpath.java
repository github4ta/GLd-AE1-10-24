package by.onliner.ui.pages.registration;

public class RegistrationPageXpath {
    public static final String MESSAGE_OR_BY_EMAIL_XPATH = "//div[@class='auth-form__label-title'][text()='или через e-mail']";
    public static final String INPUT_EMAIL_XPATH = "//input[@type='email'][@placeholder='Ваш e-mail']";
    public static final String INPUT_PASSWORD_XPATH = "//input[@type='password'][@placeholder='Придумайте пароль']";
    public static final String MESSAGE_TO_ENTER_PASSWORD_MIN_8_CHAR_XPATH = "//div[@class='auth-form__securebox auth-form__securebox_condensed']";
    public static final String INPUT_REPEAT_PASSWORD_XPATH = "//input[@type='password'][@placeholder='Повторите пароль']";

    public static final String PRIVACY_POLICY_TEXT_XPATH = "//div[contains(text(),'Ознакомлен с')]";
    public static final String ACCEPT_PROCESSING_PERSONAL_DATA_TEXT_XPATH = "//span[@class='auth-form__checkbox-sign']";
    public static final String ACCEPT_PROCESSING_PERSONAL_DATA_CHECKBOX_XPATH = "//span[@class='auth-checkbox__faux']";
    public static final String REGISTRATION_BUTTON_XPATH = "//button[@type='submit']";
    public static final String LOGIN_BUTTON_XPATH = "//a[@href='/login']";
    public static final String DO_YOU_HAVE_PROFILE_TEXT_XPATH = "//div[contains(text(),'Есть профиль на Onlíner?')]";
    public static final String COPYRIGHT_TEXT_XPATH = "//div[@class='auth-form__footer']";

    public static final String HEADER_TEXT_XPATH = "//div[contains(@class, 'auth-form__title')]";
    public static final String DESCRIPTION_SOCIAL_MEDIA_REGISTRATION_TEXT_XPATH = "(//div[@class='auth-form__label-title'])[1]";
    public static final String FACEBOOK_REGISTRATION_BUTTON_XPATH = "//a[contains(@class,'auth-form__button_fb')]";
    public static final String VK_REGISTRATION_BUTTON_XPATH = "//a[contains(@class,'auth-form__button_vk')]";
    public static final String GOOGLE_REGISTRATION_BUTTON_XPATH = "//a[contains(@class,'auth-form__button_gg')]";
}
