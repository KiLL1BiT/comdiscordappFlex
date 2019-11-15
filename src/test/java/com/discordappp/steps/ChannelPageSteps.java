package com.discordappp.steps;

import com.discordappp.pages.ChannelPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class ChannelPageSteps extends ScenarioSteps {

    ChannelPage onPage;

    @Step
    public void poopAllTheThreads() {
        onPage.poopAllTheThreads();
    }
}
