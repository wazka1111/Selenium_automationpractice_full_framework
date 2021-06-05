package com.pages;

import com.basePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.internal.EventFiringMouse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainPage extends BasePage {
    private Logger logger = LoggerFactory.getLogger(MainPage.class);



    @FindBy(partialLinkText = "Sign in")
    private WebElement signInLink;

    @FindBy(partialLinkText = "Contact us")
    private WebElement contactUs;


    @FindBy(css = "#block_top_menu > ul > li:nth-child(1) > a")
    private WebElement woman;

    @FindBy(css = "#block_top_menu > ul > li:nth-child(2) > a")
    private WebElement dress;
    @FindBy(css = "#block_top_menu > ul > li:nth-child(3) > a")
    private WebElement tshirt;

    public MainPage(WebDriver driver) {
        super(driver);
    }


    public LoginPage signInClick() {
        logger.info("Go to 'Sign in' page");
        clickObject(signInLink);
        //signInLink.click();
        return pageFactory.create(LoginPage.class);
    }
    public MainPage mouseHoverWoman() {
        logger.info("Mouse hover on Woman link");
        mouseHover(woman);

        return pageFactory.create(MainPage.class);
    }
    public MainPage mouseHoverdress() {
        logger.info("Mouse hover on Dress link");
        mouseHover(dress);

        return pageFactory.create(MainPage.class);
    }
    public MainPage mouseHovertshirt() {
        logger.info("Mouse hover on Tshirt link");
        mouseHover(tshirt);

        return pageFactory.create(MainPage.class);
    }
}
