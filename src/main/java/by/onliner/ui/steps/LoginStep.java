package by.onliner.ui.steps;

import by.onliner.ui.pages.login.LoginPage;

public class LoginStep {

    private final LoginPage loginPage;

    public LoginStep() {
        loginPage = new LoginPage();
    }

    public void fillLoginFormAndSubmit(String login, String password) {
        loginPage
                .fillUsername(login)
                .fillPassword(password)
                .clickLoginButton();
    }
}
