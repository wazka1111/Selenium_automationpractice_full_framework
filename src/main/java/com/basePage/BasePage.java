package com.basePage;

import org.openqa.selenium.*;
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

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.webDriverWait = new WebDriverWait(driver, 15);
        this.pageFactory = new PageFactory(driver);
    }

   public BasePage() {
    }

    public void clickObject(WebElement element) {
        logger.debug("Click perform on the object: " + element.getText());
        element.click();
    }
}
