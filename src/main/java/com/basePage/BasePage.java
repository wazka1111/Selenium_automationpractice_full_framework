package com.basePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public  class BasePage {
    protected WebDriver driver;
    protected WebDriverWait webDriverWait;
    protected static PageFactory pageFactory;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.webDriverWait = new WebDriverWait(driver, 15);
        this.pageFactory = new PageFactory(driver);
    }

   public BasePage() {
    }
}
