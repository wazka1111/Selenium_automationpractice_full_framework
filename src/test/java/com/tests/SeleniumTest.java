package com.tests;

import com.baseTest.TestBase;
import com.pages.MainPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class SeleniumTest extends TestBase {
    private Logger logger = LoggerFactory.getLogger("SeleniumTest.class");


    @Test
    @DisplayName("AutomationPractice")
    @Tag("Purchase")
    public void automationPracticePurchase() {
        logger.info(">>>> Start test >>>>>");

       // String actualTitle = driver.getTitle();
       // logger.info("Actual title: {}", actualTitle);
        //logger.info("Expected title: {}", System.getProperty("eTitle"));
       // assertThat(actualTitle, equalTo(System.getProperty("eTitle")));

       assertThat(
               mainPage.signInClick()
                       .login()
                        .getAccountName(), equalTo(System.getProperty("accountName")));


    }
}
