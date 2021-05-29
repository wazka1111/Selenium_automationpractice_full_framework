package com.pages;

import com.basePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id="email")
    private WebElement email;

    @FindBy(id="passwd")
    private WebElement password;

    @FindBy(id="SubmitLogin")
    private WebElement btn_submit;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public AccountPage login() {
        email.sendKeys(System.getProperty("login"));
        password.sendKeys(System.getProperty("password"));
        btn_submit.click();
        return pageFactory.create(AccountPage.class);
    }

}
