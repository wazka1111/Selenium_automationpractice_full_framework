package com.pages;

import com.basePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainPage extends BasePage {
    private Logger logger = LoggerFactory.getLogger(MainPage.class);
    @FindBy(partialLinkText = "Sign in")
    private WebElement signInLink;

    @FindBy(partialLinkText = "Contact us")
    private WebElement contactUs;

    public MainPage(WebDriver driver) {
        super(driver);
    }


    public LoginPage signInClick() {
        logger.info("Go to 'Sign in' page");
        signInLink.click();
        return pageFactory.create(LoginPage.class);
    }
}
