package com.tests;

import com.basePage.BasePage;
import com.baseTest.TestBase;
import com.pages.AccountPage;
import com.pages.LoginPage;
import com.pages.MainPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

//@Execution(ExecutionMode.CONCURRENT)
public class SeleniumTest extends TestBase {
    private Logger logger = LoggerFactory.getLogger("SeleniumTest.class");


    @Test
    @DisplayName("AutomationPractice")
    @Tag("Purchase")
    public void automationPracticePurchase1() {
        logger.info(">>>> Start test >>>>>");

        String accountName = mainPage.signInClick()
                .login()
                .getAccountName();
        AccountPage accountPage = pageFactory.create(AccountPage.class);
        assertThat(accountName, equalTo(System.getProperty("accountName")));
        accountPage.logOut();


    }
    @Test
    @DisplayName("AutomationPractice")
    @Tag("Purchase")
    public void automationPracticePurchase2() {
        logger.info(">>>> Start test >>>>>");

        String accountName = mainPage.signInClick()
                .login()
                .getAccountName();
        AccountPage accountPage = pageFactory.create(AccountPage.class);
        assertThat(accountName, equalTo(System.getProperty("accountName")));
        accountPage.logOut();


    }
    @Test
    @DisplayName("AutomationPractice")
    @Tag("Purchase")
    public void automationPracticePurchase3() {
        logger.info(">>>> Start test >>>>>");

        String accountName = mainPage.signInClick()
                .login()
                .getAccountName();
        AccountPage accountPage = pageFactory.create(AccountPage.class);
        assertThat(accountName, equalTo(System.getProperty("accountName")));
        accountPage.logOut();


    }
    @Test
    @DisplayName("AutomationPractice")
    @Tag("Purchase")
    public void automationPracticePurchase4() {
        logger.info(">>>> Start test >>>>>");

        String accountName = mainPage.signInClick()
                .login()
                .getAccountName();
        AccountPage accountPage = pageFactory.create(AccountPage.class);
        assertThat(accountName, equalTo(System.getProperty("accountName")));
        accountPage.logOut();


    }
    @Test
    @DisplayName("AutomationPractice")
    @Tag("Purchase")
    public void automationPracticePurchase5() {
        logger.info(">>>> Start test >>>>>");

        String accountName = mainPage.signInClick()
                .login()
                .getAccountName();
        AccountPage accountPage = pageFactory.create(AccountPage.class);
        assertThat(accountName, equalTo(System.getProperty("accountName")));
        accountPage.logOut();


    }

}
