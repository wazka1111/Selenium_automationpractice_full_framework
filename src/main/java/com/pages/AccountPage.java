package com.pages;

import com.basePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AccountPage extends BasePage {
    private Logger logger = LoggerFactory.getLogger(AccountPage.class);

    @FindBy(partialLinkText = "Sign out")
    private WebElement logOut;

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="//a[@class='account']/span")
    private WebElement accountName;

    public LoginPage logOut() {
        logger.info("Logout action");
        logOut.click();
        return pageFactory.create(LoginPage.class);
    }

    public  String getAccountName() {
        String text;
        try {
            text = accountName.getText();
            logger.debug("Account name :" + text);
            return text;
        }catch (Exception e) {
            logger.error("Account name failed:" +e.getMessage());
            return null;
        }
    }
}
