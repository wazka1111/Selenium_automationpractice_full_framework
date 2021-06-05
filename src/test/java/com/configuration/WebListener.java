package com.configuration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WebListener extends AbstractWebDriverEventListener {

    Logger logger = LoggerFactory.getLogger(WebListener.class);
    public void afterClickOn(WebElement element, WebDriver driver) {
        //System.out.println("Clicked on: " + element.toString());
        logger.info(">>>>>>>>>>>>>>>>>>>>>>>>Event listener afterClickOn>>>>>>>>>>>>>>>>");
    }
    public void beforeNavigateTo(String url, WebDriver driver) {
        logger.info(">>>>>>>>>>>>>>>>>>>>>>>>Event listener beforeNavigateTo>>>>>>>>>>>>>>>>");
    }

    public void afterNavigateTo(String url, WebDriver driver) {
        logger.info(">>>>>>>>>>>>>>>>>>>>>>>>Event listener afterNavigateTo>>>>>>>>>>>>>>>>" + url);
    }

    public void beforeClickOn(WebElement element, WebDriver driver) {
        logger.info(">>>>>>>>>>>>>>>>>>>>>>>>Event listener beforeClickOn>>>>>>>>>>>>>>>>");
    }
//    public void beforeFindBy(By by, WebElement element, WebDriver driver) {
//        logger.info(">>>>>>>>>>>>>>>>>>>>>>>>Event listener beforeFindBy>>>>>>>>>>>>>>>>" + element.getText());
//    }
//
//    public void afterFindBy(By by, WebElement element, WebDriver driver) {
//        logger.info(">>>>>>>>>>>>>>>>>>>>>>>>Event listener afterFindBy>>>>>>>>>>>>>>>>" + element.getText());
//    }  NULpOINTEREXCEPTION



}
