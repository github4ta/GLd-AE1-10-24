package by.onliner.ui.pages.recover;

public class RecoverPasswordPageXpath {
    public static final String AUTH_FORM_TITLE_XPATH = "//*[@id=\"container\"]/div/div/div/div/div[2]/form/div[1]";
    public static final String AUTH_FROM_DESCRIPTION_XPATH = "//*[@id=\"container\"]/div/div/div/div/div[2]/form/div[2]";
    public static final String AUTH_FORM_DATA_INPUT_XPATH = "//input[@placeholder=\"Ник, e-mail или номер телефона\"]";
    public static final String AUTH_FORM_DATA_INPUT_DESCRIPTION_XPATH = "//*[@id=\"container\"]/div/div/div/div/div[2]/form/div[3]/div/div/div/div[2]";
    public static final String AUTH_FORM_SUBMIT_BUTTON_XPATH = "//button[@type=\"submit\"]";
    public static final String AUTH_FORM_DESCRIPTION_XPATH = "//*[@id=\"container\"]/div/div/div/div/div[3]/div";
    public static final String BUTTON_OPEN_FORM_LOGIN_XPATH = "//div[@class=\"auth-bar__item auth-bar__item--text\"][text()='Вход']";
    public static final String BUTTON_OPEN_FORM_RECOVER_PASSWORD_XPATH = "//a[@href='https://profile.onliner.by/recover-password']";
    public static final String AUTH_FORM_DESCRIPTION_EMPTY_LOGIN = "//div[@class=\"auth-form__description auth-form__description_error auth-form__description_base auth-form__description_extended-other\"]";
}
