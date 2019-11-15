package com.discordappp.steps;

import com.discordappp.pages.MainPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class MainPageSteps extends ScenarioSteps {
    MainPage onPage;
    @Step
    public void goToLoginPage() {
        onPage.goToLoginPage();
    }

}
