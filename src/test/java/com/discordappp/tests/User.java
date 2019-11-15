package com.discordappp.tests;

import com.discordappp.pages.ChannelPage;
import com.discordappp.steps.ChannelPageSteps;
import com.discordappp.steps.LoginPageSteps;
import com.discordappp.steps.MainPageSteps;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

public class User extends ScenarioSteps {

    @Steps
    public MainPageSteps atMainPage;

    @Steps
    public LoginPageSteps atLoginPage;

    @Steps
    public ChannelPageSteps atChannelPage;

}
