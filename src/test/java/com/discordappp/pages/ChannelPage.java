package com.discordappp.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.List;

import static io.appium.java_client.android.AndroidKeyCode.HOME;

public class ChannelPage extends BasePage {

    private Robot robot = null;

    public ChannelPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.CLASS_NAME, using = "containerCozyBounded-1rKFAn containerCozy-jafyvG container-1YxwTf")
    private List<WebElement> messageContainer;

    @FindBy(how = How.CLASS_NAME, using = "welcomeMessage-3_Mcht")
    private WebElement chatStart;

    @FindBy(how = How.CLASS_NAME, using = "buttonContainer-KtQ8wc")
    private List<WebElement> addEmotionList;

    private void poopThread() {
        for (WebElement addEmotion : addEmotionList) {
            withAction().moveToElement(addEmotion).release().perform();
            element(addEmotion).click();
            getDriver().findElement(By.xpath("//*[@id=\"popout_208\"]/div/div/div[2]/div/div[3]/div[7]/div")).click();
        }
    }

    private void scroll() {

        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        int x = 960;
        int y = 540;
        robot.mouseMove(x, y);
        waitABit(1500);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.keyPress(KeyEvent.VK_HOME);
        waitABit(1500);
    }

    public void poopAllTheThreads() {
        boolean startMessage = element(chatStart).isVisible();

        while (!startMessage) {
            poopThread();
            scroll();
            startMessage = element(chatStart).isVisible();
        }
    }
}
