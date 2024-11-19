package by.onliner.ui.pages.login;

public class LoginPageXpath {
    public static final String BUTTON_CLOSE_XPATH = "//div[@class='auth-form__close']";
    public static final String FIELD_TITLE_USERNAME_XPATH = "(//div[@class='auth-form__label-title'])[2]";
    public static final String INPUT_NAME_XPATH = "//input[@placeholder='Ник или e-mail']";
    public static final String INPUT_PASSWORD_XPATH = "//input[@placeholder='Пароль']";
    public static final String BUTTON_LOGIN_XPATH = "//button[@type='submit']";
    public static final String TEXT_LOGIN_ENTRANCE_XPATH ="//div[@class='auth-form__title auth-form__title_big auth-form__title_condensed-default' and contains(text(), 'Вход') ]";
    public static final String TEXT_LOGIN_DESCRIPTION_ENTRANCE_XPATH="//div[@class='auth-form__label-title' and contains(text(), 'Через социальные сети') ]";
    public static final String BUTTON_ENTRANCE_FACEBOOK_XPATH="//a[@class='auth-button auth-button_subsidiary auth-button_huge auth-form__button auth-form__button_fb']";
    public static final String BUTTON_ENTRANCE_VK_XPATH="//a[@class='auth-button auth-button_extra auth-button_huge auth-form__button auth-form__button_vk']";
    public static final String BUTTON_ENTRANCE_GOOGLE_XPATH="//a[@class='auth-button auth-button_accessorial auth-button_huge auth-form__button auth-form__button_gg']";

}
