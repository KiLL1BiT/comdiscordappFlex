package com.discordappp.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;

public abstract class BasePage extends PageObject {

    public BasePage(final WebDriver driver) {
        super(driver);
    }
}
