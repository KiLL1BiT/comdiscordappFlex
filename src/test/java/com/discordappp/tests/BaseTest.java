package com.discordappp.tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

@RunWith(SerenityRunner.class)
public abstract class BaseTest {

    @Steps
    public User user;

    @Managed
    WebDriver driver;

    @Before
    public void setUp() {
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        driver.get("https://discordapp.com/");
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
    }

    @After
    public void tearDown() {
        driver.close();
    }


}
