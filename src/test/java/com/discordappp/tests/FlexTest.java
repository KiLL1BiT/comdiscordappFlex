package com.discordappp.tests;

import org.junit.Test;

public class FlexTest extends BaseTest {

    @Test
    public void flexTest() {
        user.atMainPage.goToLoginPage();
        user.atLoginPage.loginAsUser();
        user.atLoginPage.goToChannel();
        user.atChannelPage.poopAllTheThreads();

    }
}
