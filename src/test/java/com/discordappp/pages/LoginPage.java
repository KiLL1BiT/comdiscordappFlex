package com.discordappp.pages;

import com.google.inject.internal.cglib.core.$WeakCacheKey;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"app-mount\"]/div[1]/div/div[2]/div/form/div/div[3]/div[1]/div/input")
    private WebElement emailPlaceholder;

    @FindBy(how = How.XPATH, using = "//*[@id=\"app-mount\"]/div[1]/div/div[2]/div/form/div/div[3]/div[2]/div/input")
    private WebElement passwordPlaceholder;

    @FindBy(how = How.CLASS_NAME, using = "marginBottom8-AtZOdT button-3k0cO7 button-38aScr lookFilled-1Gx00P colorBrand-3pXr91 sizeLarge-1vSeWK fullWidth-1orjjo grow-q77ONN")
    private WebElement submitLoginButton;

    String email = "x_zzz.06@mail.ru";
    String username = "abuzer228";
    String password = "1488abuzer228";

    public void emailInput() {
        element(emailPlaceholder).sendKeys(email);
    }

    public void passwordInput() {
        element(passwordPlaceholder).sendKeys(password);
    }

    public void submitLogin() {
        element(passwordPlaceholder).submit();
    }

    public void goToChannel() {
        getDriver().navigate().to("https://discordapp.com/channels/301405638976864257/301405638976864257");
    }
}
