package com.discordappp.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.List;


public class ChannelPage extends BasePage {

    private Robot robot = null;

    public ChannelPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.CLASS_NAME, using = "containerCozyBounded-1rKFAn containerCozy-jafyvG container-1YxwTf")
    private List<WebElement> messageContainer;

    @FindBy(how = How.CLASS_NAME, using = "welcomeMessage-3_Mcht")
    private WebElement chatStart;

    @FindBy(how = How.CLASS_NAME, using = "buttonContainer-37UsAw")
    private List<WebElement> addEmotionList;

    @FindBy(how = How.XPATH, using = "//*[@id=\"app-mount\"]/div[1]/div/div[2]/div/div/div[2]/div/div[2]/div[2]/div[1]/div[1]/div/div/div[33]/div/div[2]/div[1]/div[1]/div/div[1]/svg")
    private WebElement element;

    @FindBy(how = How.CLASS_NAME, using = "emojiItem-109bjA")
    private WebElement poopEmotion;

    public void poopThread() {
        waitForPageToLoad();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("Array.from(document.getElementsByClassName('buttonContainer-37UsAw')).forEach(el => el.style.visibility = 'visible')");
        for (WebElement addEmotion : addEmotionList) {
            element(addEmotion).click();
            getDriver().findElement(By.className("input-1Rv96N")).sendKeys(":poop");
            getDriver().findElement((By.className("spriteItem-2AFL7r"))).click();
        }
    }

    public void waitForPageToLoad() {
        String pageLoadStatus;
        do {
            JavascriptExecutor js = (JavascriptExecutor) getDriver();
            pageLoadStatus = (String) js.executeScript("return document.readyState");
            System.out.print(".");
        } while (!pageLoadStatus.equals("complete"));
        System.out.println();
        System.out.println("Page Loaded.");
    }


    public void scroll() {

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
        }
    }
}
