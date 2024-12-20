package by.onliner.ui.pages.login;

public class LoginPageXpath {
    public static final String BUTTON_CLOSE_XPATH = "//div[@class='auth-form__close']";
    public static final String FIELD_TITLE_USERNAME_XPATH = "(//div[@class='auth-form__label-title'])[2]";
    public static final String INPUT_NAME_XPATH = "//input[@placeholder='Ник или e-mail']";
    public static final String INPUT_PASSWORD_XPATH = "//input[@placeholder='Пароль']";
    public static final String BUTTON_LOGIN_XPATH = "//button[@type='submit']";
    public static final String TEXT_LOGIN_ENTRANCE_XPATH = "//div[@class='auth-form__title auth-form__title_big auth-form__title_condensed-default' and contains(text(), 'Вход') ]";
    public static final String TEXT_LOGIN_DESCRIPTION_ENTRANCE_XPATH = "//div[@class='auth-form__label-title' and contains(text(), 'Через социальные сети') ]";
    public static final String BUTTON_ENTRANCE_FACEBOOK_XPATH = "//a[@class='auth-button auth-button_subsidiary auth-button_huge auth-form__button auth-form__button_fb']";
    public static final String BUTTON_ENTRANCE_VK_XPATH = "//a[@class='auth-button auth-button_extra auth-button_huge auth-form__button auth-form__button_vk']";
    public static final String BUTTON_ENTRANCE_GOOGLE_XPATH = "//a[@class='auth-button auth-button_accessorial auth-button_huge auth-form__button auth-form__button_gg']";
    public static final String LINK_REGISTRATION_XPATH = "//*[@class='auth-form']//*[@href='https://profile.onliner.by/registration']";
    public static final String LINK_RECOVER_PASSWORD_XPATH = "//*[@class='auth-form']//*[@href='https://profile.onliner.by/recover-password']";
    public static final String TEXT_FOOTER_XPATH = "//*[@class='auth-form__footer']//*[@class='auth-form__description']";
    public static final String BUTTON_OPEN_LOGIN_FORM_XPATH = "//*[@id='userbar']//*[text()='Вход']";
    public static final String ERROR_MESSAGE_USERNAME = "//div[@class='auth-form']//form//div[contains(@class, 'auth-form__description_error') and contains(text(), 'ник')]";
    public static final String ERROR_MESSAGE_PASSWORD = "//div[@class='auth-form']//form//div[contains(@class, 'auth-form__description_error') and contains(text(), 'пароль')]";
}
