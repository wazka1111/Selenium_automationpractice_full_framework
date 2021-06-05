package com.basePage;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.events.internal.EventFiringMouse;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.time.Duration;

public  class BasePage {
    protected WebDriver driver;
    protected WebDriverWait webDriverWait;
    protected static PageFactory pageFactory;
    protected WebElement element;
    private Logger logger = LoggerFactory.getLogger(BasePage.class);
    protected WebListener listener;
    private EventFiringMouse eventFiringMouse;



    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.webDriverWait = new WebDriverWait(driver, 15);
        listener = new WebListener();
        this.pageFactory = new PageFactory(driver);
    }

   public BasePage() {
    }

    public void clickObject(WebElement element) {
        logger.debug("Click perform on the object: " + element.getText());
        element.click();
    }
    public void mouseHover(WebElement element) {
        logger.debug("mouseHover perform on the object: " + element.getText());
        eventFiringMouse = new EventFiringMouse(driver, listener);
        Locatable item =(Locatable) element;
        Coordinates coordinates = item.getCoordinates();

        eventFiringMouse.mouseMove(coordinates);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
