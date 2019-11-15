package com.discordappp.steps;

import com.discordappp.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginPageSteps extends ScenarioSteps {

    LoginPage onPage;

    @Step
    public void loginAsUser() {
        onPage.emailInput();
        onPage.passwordInput();
        onPage.submitLogin();
    }

    @Step
    public void goToChannel() {
        onPage.goToChannel();
    }
}
