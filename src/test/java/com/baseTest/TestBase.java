package com.baseTest;

import com.basePage.BasePage;
import com.configuration.BrowserEnvironment;
import com.configuration.EnvironmentProperty;
import com.pages.LoginPage;
import com.pages.MainPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestBase extends BasePage {
    protected static WebDriver driver;
    private static Logger logger = LoggerFactory.getLogger("TestBase.class");
    private static BrowserEnvironment browserEnvironment;
    public static EnvironmentProperty environmentProperty;
    public static BasePage basePage;
    public static MainPage mainPage;


    @BeforeAll
    static void setUp() {
        environmentProperty = EnvironmentProperty.getInstance();
        browserEnvironment = new BrowserEnvironment();


    }

    @BeforeEach
    void beforeEach() throws IOException {
        driver = browserEnvironment.getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        basePage = new BasePage(driver);
        mainPage =  pageFactory.create(MainPage.class);
        logger.debug("Driver initialized");

    }

    @AfterEach
     void tearDown() {
        driver.quit();
        logger.debug("Driver closed");
    }

}
